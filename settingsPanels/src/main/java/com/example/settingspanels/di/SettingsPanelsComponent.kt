package com.example.settingspanels.di

import com.example.settingspanels.ui.SettingsPanelsActivity
import dagger.Component

@Component
interface SettingsPanelsComponent {

    fun inject(activity: SettingsPanelsActivity)
}