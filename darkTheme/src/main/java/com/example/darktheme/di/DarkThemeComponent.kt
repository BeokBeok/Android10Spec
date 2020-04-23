package com.example.darktheme.di

import com.example.darktheme.ui.DarkThemeActivity
import dagger.Component

@Component
interface DarkThemeComponent {

    fun inject(activity: DarkThemeActivity)
}