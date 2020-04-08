package com.example.android10spec.app

import android.app.Application
import com.example.android10spec.di.AppComponent
import com.example.android10spec.di.AppComponentProvider
import com.example.android10spec.di.DaggerAppComponent

class RealApplication : Application(), AppComponentProvider {

    override fun getAppComponent(): AppComponent =
        DaggerAppComponent.builder().build()
}