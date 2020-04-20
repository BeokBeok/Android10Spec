package com.example.common.ext

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.common.base.BaseAdapter

@BindingAdapter("replaceContents")
fun RecyclerView.replaceContents(item: List<Any>?) {
    @Suppress("UNCHECKED_CAST")
    (this.adapter as? BaseAdapter<Any, *>)?.run {
        replaceContents(item)
        notifyDataSetChanged()
    }
}