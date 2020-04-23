package com.example.sharingshortcuts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import com.example.common.base.BaseActivity
import com.example.sharingshortcuts.R
import com.example.sharingshortcuts.databinding.ActivitySharingShortcutsBinding
import com.example.sharingshortcuts.di.SharingShortcutsComponentProvider

class SharingShortcutsActivity :
    BaseActivity<ActivitySharingShortcutsBinding>(R.layout.activity_sharing_shortcuts) {

    override fun setupInject() {
        (application as SharingShortcutsComponentProvider).getSharingShortcutsComponent()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        binding.tvContents.movementMethod = LinkMovementMethod.getInstance()
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, SharingShortcutsActivity::class.java)
    }
}