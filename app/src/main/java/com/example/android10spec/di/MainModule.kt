package com.example.android10spec.di

import androidx.lifecycle.ViewModel
import com.example.android10spec.MainViewModel
import com.example.common.di.CommonComponent
import com.example.common.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [CommonComponent::class])
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindsMainViewModel(viewModel: MainViewModel): ViewModel
}