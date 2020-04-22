package com.example.foldables.ui

import androidx.databinding.DataBindingUtil
import com.example.common.base.BaseActivity
import com.example.foldables.R
import com.example.foldables.databinding.ActivityFoldablesBinding
import com.example.foldables.di.FoldablesComponentProvider

class FoldablesActivity : BaseActivity<ActivityFoldablesBinding>() {

    override val binding: ActivityFoldablesBinding
        get() = DataBindingUtil.setContentView(this, R.layout.activity_foldables)

    override fun setupInject() {
        (application as FoldablesComponentProvider).getFoldablesComponent().inject(this)
    }
}