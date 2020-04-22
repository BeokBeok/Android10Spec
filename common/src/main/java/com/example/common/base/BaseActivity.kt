package com.example.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: VDB

    protected abstract fun setupInject()
    protected abstract fun setupBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        setupInject()
        super.onCreate(savedInstanceState)
        setupBinding()
    }
}