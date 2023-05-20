package com.balabanova.humblr.tools

import androidx.lifecycle.ViewModel
import com.balabanova.humblr.domain.state.States
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel : ViewModel() {

    protected val _state = MutableStateFlow<States>(States.NotStarted)
    val state = _state.asStateFlow()

    protected val handler = CoroutineExceptionHandler { _, e ->
        _state.value = States.Error("${e.message}")
    }
}
