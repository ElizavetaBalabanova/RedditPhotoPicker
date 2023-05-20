package com.balabanova.humblr.ui.home

import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.balabanova.humblr.data.api.ApiToken
import com.balabanova.humblr.data.api.ONBOARDING_IS_SHOWN
import com.balabanova.humblr.data.repository.PagingSource
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.models.Subreddit
import com.balabanova.humblr.domain.repository.SubredditsRemoteRepository
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.domain.storageservice.StorageService
import com.balabanova.humblr.domain.tools.ListTypes
import com.balabanova.humblr.domain.tools.Query
import com.balabanova.humblr.domain.tools.SubQuery
import com.balabanova.humblr.tools.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: SubredditsRemoteRepository,
    private val storageService: StorageService,
    private val apiToken: ApiToken,
) : BaseViewModel() {

    private val _query = Query()
    private val subredditsSource get() = _query.source

    private val _subredditsSourceFlow = MutableStateFlow(subredditsSource)

    fun setSource(position: Int) {
        _query.source = if (position == FIRST_POSITION_INDEX) NEW else POPULAR
        _subredditsSourceFlow.value = subredditsSource
        getSubreddits()
    }

    fun createToken(code: String) {
        if (code.isNotEmpty())
            viewModelScope.launch(Dispatchers.IO) {
                _state.value = States.Loading
                try {
                    storageService.saveEncryptedToken(
                        apiToken.getToken(code = code).access_token
                    )
                    _state.value = States.Success()
                } catch (e: Exception) {
                    _state.value = States.Error(message = e.message.toString())
                }
            }
    }

    fun getSubreddits() {
        viewModelScope.launch(Dispatchers.IO + handler) {
            _state.value = States.Loading
            delay(3000)
            getSubredditsList(subredditsSource, ListTypes.SUBREDDIT)
            _state.value = States.Success()
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    var subredditsList: Flow<PagingData<ListItem>> =
        _subredditsSourceFlow.asStateFlow().flatMapLatest { source ->
            if ((source == POPULAR) || (source == NEW)) {
                getSubredditsList(source, ListTypes.SUBREDDIT).flow
            } else {
                getSubredditsList(source, ListTypes.SUBREDDITS_SEARCH).flow
            }
        }.cachedIn(CoroutineScope(Dispatchers.IO))


    private fun getSubredditsList(
        source: String?,
        listType: ListTypes
    ): Pager<String, ListItem> =
        Pager(
            config = PagingConfig(pageSize = PAGE_SIZE_SUBREDDITS),
            pagingSourceFactory = { PagingSource(repository, source, listType) }
        )

    fun subscribe(subQuery: SubQuery) {
        viewModelScope.launch(Dispatchers.IO + handler) {
            repository.subscribeOnSubreddit(subQuery.action, subQuery.name)
        }
    }

    fun navigateToSingleSubreddit(fragment: Fragment, item: ListItem) {
        fragment.findNavController().navigate(
            HomeFragmentDirections.actionNavigationHomeToNavigationSingleSubredditFragment(
                (item as Subreddit).namePrefixed
            )
        )
    }

    fun onSearchButtonClick(text: String) {
        viewModelScope.launch(Dispatchers.Main + handler) {
            _state.value = States.Loading
            _query.source = text
            _subredditsSourceFlow.value = subredditsSource
            getSubredditsList(text, ListTypes.SUBREDDITS_SEARCH)
            _state.value = States.Success()
        }
    }

    companion object {
        private const val FIRST_POSITION_INDEX = 0
        private const val NEW = "new"
        private const val POPULAR = ""
        private const val PAGE_SIZE_SUBREDDITS = 10
    }
}
