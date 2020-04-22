package com.example.foldables.di

import com.example.foldables.ui.FoldablesActivity
import dagger.Component

@Component
interface FoldablesComponent {

    fun inject(activity: FoldablesActivity)
}