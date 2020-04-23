package com.example.gesturenavigation.ui

import android.content.Context
import android.content.Intent
import com.example.common.base.BaseActivity
import com.example.gesturenavigation.R
import com.example.gesturenavigation.databinding.ActivityGestureNavigationBinding
import com.example.gesturenavigation.di.GestureNavigationComponentProvider

class GestureNavigationActivity :
    BaseActivity<ActivityGestureNavigationBinding>(R.layout.activity_gesture_navigation) {

    override fun setupInject() {
        (application as GestureNavigationComponentProvider).getGestureNavigationComponent()
            .inject(this)
    }

    companion object {

        fun getIntent(context: Context?) = Intent(context, GestureNavigationActivity::class.java)
    }
}