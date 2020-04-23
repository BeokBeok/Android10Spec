package com.example.android10spec.app

import android.app.Application
import com.example.a5gnetworks.di.DaggerFiveGNetworkComponent
import com.example.a5gnetworks.di.FiveGNetworkComponent
import com.example.a5gnetworks.di.FiveGNetworksComponentProvider
import com.example.android10spec.di.AppComponent
import com.example.android10spec.di.AppComponentProvider
import com.example.android10spec.di.DaggerAppComponent
import com.example.foldables.di.DaggerFoldablesComponent
import com.example.foldables.di.FoldablesComponent
import com.example.foldables.di.FoldablesComponentProvider

class RealApplication : Application(),
    AppComponentProvider, FoldablesComponentProvider, FiveGNetworksComponentProvider {

    override fun getAppComponent(): AppComponent =
        DaggerAppComponent.builder().build()

    override fun getFoldablesComponent(): FoldablesComponent =
        DaggerFoldablesComponent.builder().build()

    override fun getFiveGNetworksComponent(): FiveGNetworkComponent =
        DaggerFiveGNetworkComponent.builder().build()
}