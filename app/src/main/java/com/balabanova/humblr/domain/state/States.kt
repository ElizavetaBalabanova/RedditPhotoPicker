package com.balabanova.humblr.domain.state

sealed interface States {
    object NotStarted : States
    object Loading : States
    data class Success(var data: Any? = null, var data2: Any? = null) : States
    data class Error(var message: String = "") : States
}
