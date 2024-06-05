package com.github.hemoptysisheart.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    companion object {
        private const val TAG = "SplashViewModel"
    }

    private val _timeout = MutableStateFlow(false)
    val timeout: StateFlow<Boolean> = _timeout

    init {
        viewModelScope.launch {
            delay(5000L)
            _timeout.emit(true)
        }
    }
}
