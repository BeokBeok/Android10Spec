package com.example.android10spec.app

import android.app.Application
import com.example.a5gnetworks.di.DaggerFiveGNetworkComponent
import com.example.a5gnetworks.di.FiveGNetworkComponent
import com.example.a5gnetworks.di.FiveGNetworksComponentProvider
import com.example.android10spec.di.AppComponent
import com.example.android10spec.di.AppComponentProvider
import com.example.android10spec.di.DaggerAppComponent
import com.example.darktheme.di.DaggerDarkThemeComponent
import com.example.darktheme.di.DarkThemeComponent
import com.example.darktheme.di.DarkThemeComponentProvider
import com.example.foldables.di.DaggerFoldablesComponent
import com.example.foldables.di.FoldablesComponent
import com.example.foldables.di.FoldablesComponentProvider
import com.example.gesturenavigation.di.DaggerGestureNavigationComponent
import com.example.gesturenavigation.di.GestureNavigationComponent
import com.example.gesturenavigation.di.GestureNavigationComponentProvider
import com.example.settingspanels.di.DaggerSettingsPanelsComponent
import com.example.settingspanels.di.SettingsPanelsComponent
import com.example.settingspanels.di.SettingsPanelsComponentProvider
import com.example.sharingshortcuts.di.DaggerSharingShortcutsComponent
import com.example.sharingshortcuts.di.SharingShortcutsComponent
import com.example.sharingshortcuts.di.SharingShortcutsComponentProvider
import com.example.smartreplyinnotifications.di.DaggerSmartReplyInNotificationComponent
import com.example.smartreplyinnotifications.di.SmartReplyInNotificationComponent
import com.example.smartreplyinnotifications.di.SmartReplyInNotificationComponentProvider

class RealApplication : Application(),
    AppComponentProvider, FoldablesComponentProvider, FiveGNetworksComponentProvider,
    SmartReplyInNotificationComponentProvider, DarkThemeComponentProvider,
    GestureNavigationComponentProvider, SettingsPanelsComponentProvider,
    SharingShortcutsComponentProvider {

    override fun getAppComponent(): AppComponent =
        DaggerAppComponent.builder().build()

    override fun getFoldablesComponent(): FoldablesComponent =
        DaggerFoldablesComponent.builder().build()

    override fun getFiveGNetworksComponent(): FiveGNetworkComponent =
        DaggerFiveGNetworkComponent.builder().build()

    override fun getSmartReplyInNotificationComponent(): SmartReplyInNotificationComponent =
        DaggerSmartReplyInNotificationComponent.builder().build()

    override fun getDarkThemeComponent(): DarkThemeComponent =
        DaggerDarkThemeComponent.builder().build()

    override fun getGestureNavigationComponent(): GestureNavigationComponent =
        DaggerGestureNavigationComponent.builder().build()

    override fun getSettingsPanelsComponent(): SettingsPanelsComponent =
        DaggerSettingsPanelsComponent.builder().build()

    override fun getSharingShortcutsComponent(): SharingShortcutsComponent =
        DaggerSharingShortcutsComponent.builder().build()
}