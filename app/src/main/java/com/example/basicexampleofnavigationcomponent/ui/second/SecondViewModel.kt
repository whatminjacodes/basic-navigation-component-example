package com.example.basicexampleofnavigationcomponent.ui.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is second fragment"
    }
    val text: LiveData<String> = _text
}