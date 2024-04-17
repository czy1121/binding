@file:Suppress("FunctionName")
package me.reezy.cosmo.binding.adapter.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("src")
fun BindingAdapter_src(view: ImageView, value: String?) {
    view.load(value)
}

@BindingAdapter("src")
fun BindingAdapter_src(view: ImageView, value: Int) {
    view.setImageResource(value)
}

@BindingAdapter(value = ["src", "fallback"])
fun BindingAdapter_src_fallback(view: ImageView, value: String?, resId: Int) {
    view.load(value) {
        fallback(resId)
    }
}

@BindingAdapter(value = ["src", "error"])
fun BindingAdapter_src_error(view: ImageView, value: String?, resId: Int) {
    view.load(value) {
        error(resId)
    }
}

@BindingAdapter(value = ["src", "error", "fallback"])
fun BindingAdapter_src(view: ImageView, value: String?, errorResId: Int, fallbackResId: Int) {
    view.load(value) {
        error(errorResId)
        fallback(fallbackResId)
    }
}

@BindingAdapter(value = ["src", "allowHardware"])
fun BindingAdapter_src_allowHardware(view: ImageView, value: String?, allow: Boolean) {
    view.load(value) {
        allowHardware(allow)
    }
}