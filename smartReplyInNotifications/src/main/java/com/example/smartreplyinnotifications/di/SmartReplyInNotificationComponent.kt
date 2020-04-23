package com.example.smartreplyinnotifications.di

import com.example.smartreplyinnotifications.ui.SmartReplyInNotificationsActivity
import dagger.Component

@Component
interface SmartReplyInNotificationComponent {

    fun inject(activity: SmartReplyInNotificationsActivity)
}