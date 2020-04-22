package com.example.foldables.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.common.base.BaseActivity
import com.example.foldables.R
import com.example.foldables.databinding.ActivityFoldablesBinding
import com.example.foldables.di.FoldablesComponentProvider

class FoldablesActivity : BaseActivity<ActivityFoldablesBinding>() {

    override val binding: ActivityFoldablesBinding
        get() = DataBindingUtil.setContentView<ActivityFoldablesBinding>(
            this,
            R.layout.activity_foldables
        ).apply {
            lifecycleOwner = this@FoldablesActivity
        }

    override fun setupInject() {
        (application as FoldablesComponentProvider).getFoldablesComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, FoldablesActivity::class.java)
    }
}