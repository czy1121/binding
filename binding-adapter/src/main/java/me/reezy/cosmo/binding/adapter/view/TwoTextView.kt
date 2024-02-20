@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import coil.imageLoader
import coil.request.ImageRequest
import me.reezy.cosmo.tv.TwoTextView

@BindingAdapter("tvText2")
fun BindingAdapter_tvText2(view: TwoTextView, value: String?) {
    view.text2 = value
}

@BindingAdapter("tvHtml2")
fun BindingAdapter_tvHtml2(view: TwoTextView, value: String?) {
    view.text2 = if (value != null) HtmlCompat.fromHtml(value, HtmlCompat.FROM_HTML_MODE_COMPACT) else ""
}

@BindingAdapter("tvIcon")
fun BindingAdapter_tvIcon(view: TwoTextView, value: String?) {
    val uri = value ?: return

    view.context.imageLoader.enqueue(ImageRequest.Builder(view.context).data(uri).target {
        view.icon = it
    }.build())
}