@file:Suppress("FunctionName")

package me.reezy.cosmo.binding.adapter.theme

import android.content.res.ColorStateList
import android.widget.TextView
import androidx.core.widget.TextViewCompat
import androidx.databinding.BindingAdapter


@BindingAdapter("textColor")
fun BindingAdapter_textColor(view: TextView, value: ColorStateList?) {
    view.setTextColor(value)
}


@BindingAdapter("compoundDrawableTint")
fun BindingAdapter_compoundDrawableTint(view: TextView, value: ColorStateList?) {
    TextViewCompat.setCompoundDrawableTintList(view, value)
}