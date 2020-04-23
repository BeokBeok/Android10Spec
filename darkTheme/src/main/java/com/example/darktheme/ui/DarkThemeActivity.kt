package com.example.darktheme.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import com.example.common.base.BaseActivity
import com.example.darktheme.R
import com.example.darktheme.databinding.ActivityDarkThemeBinding
import com.example.darktheme.di.DarkThemeComponentProvider

class DarkThemeActivity : BaseActivity<ActivityDarkThemeBinding>(R.layout.activity_dark_theme) {

    override fun setupInject() {
        (application as DarkThemeComponentProvider).getDarkThemeComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        binding.tvContents.movementMethod = LinkMovementMethod.getInstance()
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, DarkThemeActivity::class.java)
    }
}