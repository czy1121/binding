@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.custom

import androidx.databinding.BindingAdapter
import coil.imageLoader
import coil.request.ImageRequest
import me.reezy.cosmo.bk.BKTextView


@BindingAdapter("bkIcon")
fun BindingAdapter_bkIcon(view: BKTextView, value: String?) {
    val uri = value ?: return
    view.context.imageLoader.enqueue(ImageRequest.Builder(view.context).data(uri).target {
        view.icon = it
    }.build())
}