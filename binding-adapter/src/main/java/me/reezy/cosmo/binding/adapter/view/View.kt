@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.core.view.setMargins
import androidx.core.view.updateLayoutParams
import androidx.databinding.BindingAdapter


@BindingAdapter("visible")
fun BindingAdapter_visible(view: View, value: Boolean) {
    view.isVisible = value
}

@BindingAdapter("invisible")
fun BindingAdapter_invisible(view: View, value: Boolean) {
    view.isInvisible = value
}

@BindingAdapter("isSelected")
fun BindingAdapter_isSelected(view: View, value: Boolean) {
    view.isSelected = value
}

@BindingAdapter("isActivated")
fun BindingAdapter_isActivated(view: View, value: Boolean) {
    view.isActivated = value
}

@BindingAdapter("isEnabled")
fun BindingAdapter_isEnabled(view: View, value: Boolean) {
    view.isEnabled = value
}

@BindingAdapter("background")
fun BindingAdapter_background(view: View, value: Int) {
    view.setBackgroundResource(value)
}

@BindingAdapter("layout_margin")
fun BindingAdapter_margin(view: View, value: Float) {
    val lp = view.layoutParams
    if (lp is MarginLayoutParams) {
        val margin = (value * view.resources.displayMetrics.density).toInt()
        lp.setMargins(margin)
    }
    view.layoutParams = lp
}
