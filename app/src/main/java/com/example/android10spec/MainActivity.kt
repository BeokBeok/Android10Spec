package com.example.android10spec

import android.os.Bundle
import android.util.ArrayMap
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a5gnetworks.ui.FiveGNetworksActivity
import com.example.android10spec.databinding.ActivityMainBinding
import com.example.android10spec.databinding.RvItemMainBinding
import com.example.android10spec.di.AppComponentProvider
import com.example.common.base.BaseActivity
import com.example.common.base.BaseAdapter
import com.example.common.base.BaseViewModel
import com.example.common.base.ResourceBinding
import com.example.darktheme.ui.DarkThemeActivity
import com.example.foldables.ui.FoldablesActivity
import com.example.gesturenavigation.ui.GestureNavigationActivity
import com.example.smartreplyinnotifications.ui.SmartReplyInNotificationsActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupRecyclerView()
        setupObserver()
    }

    override fun setupInject() =
        (application as AppComponentProvider).getAppComponent().inject(this)

    override fun setupViewModel() {
        binding.vm = mainViewModel
    }

    private fun setupRecyclerView() {
        binding.rvContents.adapter = object : BaseAdapter<String, RvItemMainBinding>(
            resourceBinding = ResourceBinding(R.layout.rv_item_main, BR.specItem),
            viewModels = ArrayMap<Int, BaseViewModel>().apply {
                put(BR.vm, mainViewModel)
            }
        ) {}
    }

    private fun setupObserver() {
        mainViewModel.selectedItem.observe(this, Observer {
            it.getContentIfNotHandled()?.let { spec ->
                when (spec) {
                    "Foldables" -> startActivity(FoldablesActivity.getIntent(this))
                    "5G Networks" -> startActivity(FiveGNetworksActivity.getIntent(this))
                    "Smart Reply in notifications" -> startActivity(
                        SmartReplyInNotificationsActivity.getIntent(this)
                    )
                    "Dark Theme" -> startActivity(DarkThemeActivity.getIntent(this))
                    "Gesture Navigation" -> startActivity(GestureNavigationActivity.getIntent(this))
                    "Settings Panels" -> Unit
                    "Sharing shortcuts" -> Unit
                }
            }
        })
    }
}