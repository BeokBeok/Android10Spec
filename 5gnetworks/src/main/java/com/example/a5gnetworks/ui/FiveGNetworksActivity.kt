package com.example.a5gnetworks.ui

import android.content.Context
import android.content.Intent
import com.example.a5gnetworks.R
import com.example.a5gnetworks.databinding.ActivityFiveGNetworksBinding
import com.example.a5gnetworks.di.FiveGNetworksComponentProvider
import com.example.common.base.BaseActivity

class FiveGNetworksActivity :
    BaseActivity<ActivityFiveGNetworksBinding>(R.layout.activity_five_g_networks) {

    override fun setupInject() {
        (application as FiveGNetworksComponentProvider).getFiveGNetworksComponent().inject(this)
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, FiveGNetworksActivity::class.java)
    }
}
