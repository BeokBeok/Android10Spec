package com.example.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {

    protected abstract val binding: VDB

    protected abstract fun setupInject()

    override fun onCreate(savedInstanceState: Bundle?) {
        setupInject()
        super.onCreate(savedInstanceState)
    }
}