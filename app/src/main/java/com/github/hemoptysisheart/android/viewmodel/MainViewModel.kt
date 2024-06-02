package com.github.hemoptysisheart.android.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    companion object {
        private const val TAG = "MainViewModel"
    }

    init {
        Log.d(TAG, "#init called.")
    }
}
