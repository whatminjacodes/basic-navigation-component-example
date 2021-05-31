package com.example.basicexampleofnavigationcomponent.ui.third

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is third fragment"
    }
    val text: LiveData<String> = _text
}