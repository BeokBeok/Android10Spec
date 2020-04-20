package com.example.common.base

import android.util.ArrayMap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

data class ResourceBinding(
    @LayoutRes val layoutId: Int,
    val bindingId: Int
)

abstract class BaseAdapter<ITEM : Any, VDB : ViewDataBinding>(
    private val resourceBinding: ResourceBinding,
    private val viewModels: ArrayMap<Int, BaseViewModel>? = null
) : RecyclerView.Adapter<BaseViewHolder<VDB>>() {

    private val contents = mutableListOf<ITEM>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VDB> =
        object : BaseViewHolder<VDB>(parent, resourceBinding, viewModels) {}

    override fun getItemCount(): Int = contents.size

    override fun onBindViewHolder(holder: BaseViewHolder<VDB>, position: Int) =
        holder.bindViewHolder(contents[position])

    fun replaceContents(item: List<ITEM>?) {
        if (item == null) return

        contents.run {
            clear()
            addAll(item)
        }
    }
}

abstract class BaseViewHolder<VDB : ViewDataBinding>(
    parent: ViewGroup,
    private val resourceBinding: ResourceBinding,
    private val viewModels: ArrayMap<Int, BaseViewModel>? = null
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(resourceBinding.layoutId, parent)
) {
    private val binding: VDB? = DataBindingUtil.bind(itemView)

    fun bindViewHolder(item: Any?) {
        if (item == null) return
        binding?.setVariable(resourceBinding.bindingId, item)

        if (viewModels == null) return
        for (key in viewModels.keys) {
            binding?.setVariable(key, viewModels[key])
        }
    }
}