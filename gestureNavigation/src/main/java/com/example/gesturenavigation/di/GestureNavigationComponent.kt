package com.example.gesturenavigation.di

import com.example.gesturenavigation.ui.GestureNavigationActivity
import dagger.Component

@Component
interface GestureNavigationComponent {

    fun inject(activity: GestureNavigationActivity)
}