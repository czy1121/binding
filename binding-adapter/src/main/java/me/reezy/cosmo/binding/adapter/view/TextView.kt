@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("html")
fun BindingAdapter_html(view: TextView, value: String?) {
    view.text = if (value != null) HtmlCompat.fromHtml(value, HtmlCompat.FROM_HTML_MODE_COMPACT) else ""
}