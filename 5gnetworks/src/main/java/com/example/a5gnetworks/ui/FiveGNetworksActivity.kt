package com.example.a5gnetworks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import com.example.a5gnetworks.R
import com.example.a5gnetworks.databinding.ActivityFiveGNetworksBinding
import com.example.a5gnetworks.di.FiveGNetworksComponentProvider
import com.example.common.base.BaseActivity

class FiveGNetworksActivity :
    BaseActivity<ActivityFiveGNetworksBinding>(R.layout.activity_five_g_networks) {

    override fun setupInject() {
        (application as FiveGNetworksComponentProvider).getFiveGNetworksComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        binding.tvContents.movementMethod = LinkMovementMethod.getInstance()
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, FiveGNetworksActivity::class.java)
    }
}
