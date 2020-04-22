package com.example.android10spec

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.common.base.BaseViewModel
import com.example.common.util.SingleEvent
import javax.inject.Inject

class MainViewModel @Inject constructor() : BaseViewModel() {

    val specList = listOf(
        "Foldables",
        "5G Networks",
        "Smart Reply in notifications",
        "Dark Theme",
        "Gesture Navigation",
        "Settings Panels",
        "Sharing shortcuts"
    )

    private val _selectedItem = MutableLiveData<SingleEvent<String>>()
    val selectedItem: LiveData<SingleEvent<String>> get() = _selectedItem

    override fun onClick(model: Any) {
        if (model is String) {
            _selectedItem.value = SingleEvent(model)
        }
    }
}
