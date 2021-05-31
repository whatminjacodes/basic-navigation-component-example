package com.example.basicexampleofnavigationcomponent.ui.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is first fragment"
    }
    val text: LiveData<String> = _text
}