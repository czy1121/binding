@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import coil.imageLoader
import coil.request.ImageRequest
import me.reezy.cosmo.tv.ThreeTextView

@BindingAdapter("text2")
fun BindingAdapter_text2(view: ThreeTextView, value: String?) {
    view.text2 = value
}

@BindingAdapter("text3")
fun BindingAdapter_text3(view: ThreeTextView, value: String?) {
    view.text3 = value
}

@BindingAdapter("html2")
fun BindingAdapter_html2(view: ThreeTextView, value: String?) {
    view.text2 = if (value != null) HtmlCompat.fromHtml(value, HtmlCompat.FROM_HTML_MODE_COMPACT) else ""
}

@BindingAdapter("html3")
fun BindingAdapter_html3(view: ThreeTextView, value: String?) {
    view.text3 = if (value != null) HtmlCompat.fromHtml(value, HtmlCompat.FROM_HTML_MODE_COMPACT) else ""
}

@BindingAdapter("leftIcon")
fun BindingAdapter_leftIcon(view: ThreeTextView, value: String?) {
    val uri = value ?: return

    view.context.imageLoader.enqueue(ImageRequest.Builder(view.context).data(uri).target {
        view.leftIcon = it
    }.build())
}