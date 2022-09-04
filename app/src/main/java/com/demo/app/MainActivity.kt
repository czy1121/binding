package com.demo.app

import android.app.Dialog
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.demo.app.databinding.ActivityMainBinding
import com.demo.app.databinding.LayoutSimpleBinding
import me.reezy.cosmo.binding.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    val binding0 by lazy { ActivityMainBinding.bind(findViewById<ViewGroup>(android.R.id.content).getChildAt(0)) }

    val binding1: ActivityMainBinding by binding()

    val binding2: ActivityMainBinding by binding(this)
}

class SimpleFragment : Fragment(R.layout.layout_simple) {

    val binding0 by lazy { LayoutSimpleBinding.bind(requireView()) }

    val binding1: LayoutSimpleBinding by binding()

    val binding2: LayoutSimpleBinding by binding(this)
}



class SimpleDialog(context: Context) : Dialog(context), LifecycleOwner {

    val binding0 by lazy { LayoutSimpleBinding.bind(requireView()) }

    val binding1: LayoutSimpleBinding by binding(viewFinder = this::requireView)

    val binding2: LayoutSimpleBinding by binding(owner = this, viewFinder = this::requireView)

    init {
        setContentView(R.layout.layout_simple)

    }

    fun requireView(): View {
        TODO("Not yet implemented")
    }

    override fun getLifecycle(): Lifecycle {
        TODO("Not yet implemented")
    }
}

class CustomView(context: Context, attrs: AttributeSet? = null): ViewGroup(context, attrs) {

    val binding0 by lazy { LayoutSimpleBinding.inflate(LayoutInflater.from(context), this, true) }

    val binding1: LayoutSimpleBinding by binding()

    val binding2: LayoutSimpleBinding by binding(resolveLifecycleOwner)


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
    }

}