@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.custom

import androidx.databinding.BindingAdapter
import coil.imageLoader
import coil.request.ImageRequest
import me.reezy.cosmo.tv.LiteTextView

@BindingAdapter("android:text")
fun BindingAdapter_text(view: LiteTextView, value: String?) {
    view.text = value
}

@BindingAdapter("icon")
fun BindingAdapter_icon(view: LiteTextView, value: String?) {
    val uri = value ?: return

    view.context.imageLoader.enqueue(ImageRequest.Builder(view.context).data(uri).target {
        view.icon = it
    }.build())
}