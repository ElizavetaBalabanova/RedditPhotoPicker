package com.balabanova.humblr.ui.profile

import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.balabanova.humblr.domain.repository.ProfileRemoteRepository
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.tools.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FriendsViewModel @Inject constructor(
    private val repository: ProfileRemoteRepository
) : BaseViewModel() {

    fun getFriends() {
        viewModelScope.launch(Dispatchers.IO + handler) {
            _state.value = States.Loading
            _state.value = States.Success(repository.getFriends())
        }
    }
    fun navigateBack(fragment: Fragment) {
        fragment.findNavController().popBackStack()
    }
}
