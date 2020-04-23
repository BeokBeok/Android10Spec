package com.example.smartreplyinnotifications.ui

import android.content.Context
import android.content.Intent
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

    companion object {

        fun getIntent(context: Context?) =
            Intent(context, SmartReplyInNotificationsActivity::class.java)
    }
}