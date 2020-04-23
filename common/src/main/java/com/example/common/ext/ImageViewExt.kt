package com.example.common.ext

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.common.wrapper.GlideWrapper

@BindingAdapter("glideWithDrawable")
fun ImageView.glideWithDrawable(drawable: Drawable) {
    GlideWrapper.showImageWithDrawable(this, drawable)
}