package com.example.android10spec

import com.example.android10spec.databinding.ActivityMainBinding
import com.example.android10spec.di.AppComponentProvider
import com.example.common.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(layoutId = R.layout.activity_main) {

    override fun setupInject() =
        (application as AppComponentProvider).getAppComponent().inject(this)
}