package com.example.viewpager2sample

import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

object Utils {

    @BindingAdapter("setBackgroundColor")
    @JvmStatic
    fun ConstraintLayout.setBgColor(color:Int){
        setBackgroundColor(ContextCompat.getColor(this.context,color))
    }

    @BindingAdapter("setImage")
    @JvmStatic
    fun ImageView.setLogo(resource:Int){
        setImageResource(resource)
    }

}