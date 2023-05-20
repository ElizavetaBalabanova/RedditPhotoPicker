package com.balabanova.humblr.ui.profile

import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.balabanova.humblr.data.api.TOKEN_ENABLED_KEY
import com.balabanova.humblr.data.api.TOKEN_SHARED_KEY
import com.balabanova.humblr.domain.repository.ProfileRemoteRepository
import com.balabanova.humblr.domain.repository.SubredditsRemoteRepository
import com.balabanova.humblr.domain.storageservice.StorageService
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.tools.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repositoryProfile: ProfileRemoteRepository,
    private val repositorySubreddits: SubredditsRemoteRepository,
    private val storageService: StorageService
) : BaseViewModel() {

    fun getProfile() {
        viewModelScope.launch(Dispatchers.IO + handler) {
            _state.value = States.Loading
            _state.value = States.Success(repositoryProfile.getLoggedUserProfile())
        }
    }

    fun getClearedUrlAvatar(urlAvatar: String): String {
        var clearedUrl = urlAvatar
        if (urlAvatar.contains('?')) {
            val questionMark = urlAvatar.indexOf('?', 0)
            clearedUrl = urlAvatar.substring(0, questionMark)
        }
        return clearedUrl
    }

    fun logout(fragment: Fragment) {
        storageService.save(TOKEN_SHARED_KEY, "")
        storageService.save(TOKEN_ENABLED_KEY, false)
        fragment.findNavController()
            .navigate(ProfileFragmentDirections.actionNavigationProfileToNavigationAuth())
    }

    fun navigateToFriends(fragment: Fragment) {
        fragment.findNavController().navigate(
            ProfileFragmentDirections
                .actionNavigationProfileToNavigationFriends()
        )
    }

    fun clearSaved() {
        viewModelScope.launch(Dispatchers.IO + handler) {
            repositorySubreddits.unsaveAllSavedPosts()
        }
    }
}
