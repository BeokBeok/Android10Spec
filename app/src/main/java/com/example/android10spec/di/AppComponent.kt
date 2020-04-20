package com.example.android10spec.di

import com.example.android10spec.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}