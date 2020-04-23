package com.example.foldables.ui

import android.content.Context
import android.content.Intent
import com.example.common.base.BaseActivity
import com.example.foldables.R
import com.example.foldables.databinding.ActivityFoldablesBinding
import com.example.foldables.di.FoldablesComponentProvider

class FoldablesActivity : BaseActivity<ActivityFoldablesBinding>(R.layout.activity_foldables) {

    override fun setupInject() {
        (application as FoldablesComponentProvider).getFoldablesComponent().inject(this)
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, FoldablesActivity::class.java)
    }
}