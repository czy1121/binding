@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.view

import android.content.res.ColorStateList
import android.widget.RatingBar
import androidx.databinding.BindingAdapter


@BindingAdapter("progressTint")
fun BindingAdapter_progressTint(view: RatingBar, color: Int) {
    view.progressTintList = ColorStateList.valueOf(color)
}

@BindingAdapter("secondaryProgressTint")
fun BindingAdapter_secondaryProgressTintList(view: RatingBar, color: Int) {
    view.secondaryProgressTintList = ColorStateList.valueOf(color)
}

@BindingAdapter("progressBackgroundTint")
fun BindingAdapter_progressBackgroundTint(view: RatingBar, color: Int) {
    view.progressBackgroundTintList = ColorStateList.valueOf(color)
}