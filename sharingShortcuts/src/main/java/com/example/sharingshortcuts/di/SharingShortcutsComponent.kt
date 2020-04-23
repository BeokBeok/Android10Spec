package com.example.sharingshortcuts.di

import com.example.sharingshortcuts.ui.SharingShortcutsActivity
import dagger.Component

@Component
interface SharingShortcutsComponent {

    fun inject(activity: SharingShortcutsActivity)
}