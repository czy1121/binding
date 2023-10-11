@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import androidx.databinding.BindingAdapter
import me.reezy.cosmo.bk.BKFrameLayout
import me.reezy.cosmo.bk.BKLinearLayout
import me.reezy.cosmo.bk.BKTextView


@BindingAdapter("bkStrokeColor")
fun BindingAdapter_bkStrokeColor(view: BKTextView, value: ColorStateList?) {
    view.bk.strokeColor = value
}

@BindingAdapter("bkBackgroundColor")
fun BindingAdapter_bkBackgroundColor(view: BKTextView, value: ColorStateList?) {
    view.bk.backgroundColor = value
}


@BindingAdapter("bkStrokeColor")
fun BindingAdapter_bkStrokeColor(view: BKLinearLayout, value: ColorStateList?) {
    view.bk.strokeColor = value
}

@BindingAdapter("bkBackgroundColor")
fun BindingAdapter_bkBackgroundColor(view: BKLinearLayout, value: ColorStateList?) {
    view.bk.backgroundColor = value
}


@BindingAdapter("bkStrokeColor")
fun BindingAdapter_bkStrokeColor(view: BKFrameLayout, value: ColorStateList?) {
    view.bk.strokeColor = value
}

@BindingAdapter("bkBackgroundColor")
fun BindingAdapter_bkBackgroundColor(view: BKFrameLayout, value: ColorStateList?) {
    view.bk.backgroundColor = value
}