package com.example.android10spec

import android.os.Bundle
import android.util.ArrayMap
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.android10spec.databinding.ActivityMainBinding
import com.example.android10spec.databinding.RvItemMainBinding
import com.example.android10spec.di.AppComponentProvider
import com.example.common.base.BaseActivity
import com.example.common.base.BaseAdapter
import com.example.common.base.BaseViewModel
import com.example.common.base.ResourceBinding
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val binding: ActivityMainBinding
        get() = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .apply {
                lifecycleOwner = this@MainActivity
                vm = mainViewModel
            }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupRecyclerView()
    }

    override fun setupInject() =
        (application as AppComponentProvider).getAppComponent().inject(this)

    private fun setupRecyclerView() {
        binding.rvContents.adapter = object : BaseAdapter<String, RvItemMainBinding>(
            resourceBinding = ResourceBinding(R.layout.rv_item_main, BR.specItem),
            viewModels = ArrayMap<Int, BaseViewModel>().apply {
                put(BR.vm, mainViewModel)
            }
        ) {}
    }
}