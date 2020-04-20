package com.example.common.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VDB : ViewDataBinding>(
    @LayoutRes
    private val layoutId: Int
) : AppCompatActivity() {

    protected lateinit var binding: VDB

    protected abstract fun setupInject()

    override fun onCreate(savedInstanceState: Bundle?) {
        setupInject()
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    private fun setupBinding() {
        binding = DataBindingUtil.setContentView<VDB>(this, layoutId).apply {
            lifecycleOwner = this@BaseActivity
        }
    }
}