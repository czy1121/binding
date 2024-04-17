@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import android.widget.AbsListView
import android.widget.RatingBar
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

//@BindingMethods(
//    BindingMethod(type = RatingBar::class, attribute = "android:progressTint", method = "setProgressTintList"),
//    BindingMethod(type = RatingBar::class, attribute = "android:secondaryProgressTint", method = "setSecondaryProgressTint"),
//    BindingMethod(type = RatingBar::class, attribute = "android:progressBackgroundTint", method = "setProgressBackgroundTint"),
//)
//object RatingBarBindingAdapter {
//
//}


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