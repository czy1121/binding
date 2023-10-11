@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("backgroundTint")
fun BindingAdapter_backgroundTint(view: View, value: ColorStateList?) {
    view.backgroundTintList = value
}

@BindingAdapter("foregroundTint")
fun BindingAdapter_foregroundTint(view: View, value: ColorStateList?) {
    view.foregroundTintList = value
}

