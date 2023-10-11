@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
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
fun BindingAdapter_isSelected(view: View, isSelected: Boolean) {
    view.isSelected = isSelected
}
