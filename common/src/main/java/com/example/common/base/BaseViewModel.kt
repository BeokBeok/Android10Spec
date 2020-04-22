package com.example.common.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    open fun onClick(model: Any) = Unit
}