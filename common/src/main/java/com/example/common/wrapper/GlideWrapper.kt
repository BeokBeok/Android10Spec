package com.example.common.wrapper

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideWrapper {

    fun showImageWithDrawable(iv: ImageView, drawable: Drawable) {
        Glide.with(iv)
            .load(drawable)
            .placeholder(android.R.mipmap.sym_def_app_icon)
            .into(iv)
    }
}