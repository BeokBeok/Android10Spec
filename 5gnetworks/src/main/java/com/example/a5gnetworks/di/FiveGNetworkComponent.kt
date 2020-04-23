package com.example.a5gnetworks.di

import com.example.a5gnetworks.ui.FiveGNetworksActivity
import dagger.Component

@Component
interface FiveGNetworkComponent {

    fun inject(activity: FiveGNetworksActivity)
}