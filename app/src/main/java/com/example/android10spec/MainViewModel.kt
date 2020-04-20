package com.example.android10spec

import com.example.common.base.BaseViewModel
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
}
