@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import androidx.databinding.BindingAdapter
import com.google.android.material.imageview.ShapeableImageView


@BindingAdapter("strokeColor")
fun BindingAdapter_strokeColor(view: ShapeableImageView, value: ColorStateList?) {
    view.strokeColor = value
}