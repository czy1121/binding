@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("imageTint")
fun BindingAdapter_imageTint(view: ImageView, value: ColorStateList?) {
    view.imageTintList = value
}
