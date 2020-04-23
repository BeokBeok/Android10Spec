package com.example.smartreplyinnotifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import com.example.common.base.BaseActivity
import com.example.smartreplyinnotifications.R
import com.example.smartreplyinnotifications.databinding.ActivitySmartReplyInNotificationsBinding
import com.example.smartreplyinnotifications.di.SmartReplyInNotificationComponentProvider

class SmartReplyInNotificationsActivity :
    BaseActivity<ActivitySmartReplyInNotificationsBinding>(R.layout.activity_smart_reply_in_notifications) {

    override fun setupInject() {
        (application as SmartReplyInNotificationComponentProvider).getSmartReplyInNotificationComponent()
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

        fun getIntent(context: Context?) =
            Intent(context, SmartReplyInNotificationsActivity::class.java)
    }
}