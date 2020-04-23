package com.example.settingspanels.ui

import android.content.Context
import android.content.Intent
import com.example.common.base.BaseActivity
import com.example.settingspanels.R
import com.example.settingspanels.databinding.ActivitySettingsPanelsBinding
import com.example.settingspanels.di.SettingsPanelsComponentProvider

class SettingsPanelsActivity :
    BaseActivity<ActivitySettingsPanelsBinding>(R.layout.activity_settings_panels) {

    override fun setupInject() {
        (application as SettingsPanelsComponentProvider).getSettingsPanelsComponent().inject(this)
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, SettingsPanelsActivity::class.java)
    }
}