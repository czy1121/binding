@file:Suppress("FunctionName")
package me.reezy.cosmo.binding.adapter.view

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("src")
fun BindingAdapter_src(view: ImageView, value: String?) {
    view.load(value ?: return) {
        this.allowHardware(true)
    }
}

@BindingAdapter("src")
fun BindingAdapter_src(view: ImageView, value: Int) {
    view.setImageResource(value)
}

@BindingAdapter(value = ["src", "placeholder"])
fun BindingAdapter_src(view: ImageView, value: String?, placeholder: Drawable?) {
    view.load(value ?: return) {
        placeholder(placeholder)
    }
}