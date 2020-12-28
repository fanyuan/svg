package com.example.svg

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import com.example.svg.databinding.ActivitySvg01Binding

class Svg01Activity : AppCompatActivity() {
    var binding:ActivitySvg01Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_svg01)
        binding = DataBindingUtil.setContentView<ActivitySvg01Binding>(this,R.layout.activity_svg01)
        binding?.act = this
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun click(){
        Log.d("ddebug","---click---")
        binding?.tv?.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.arrow_forward,R.drawable.arrow_forward,R.drawable.arrow_forward,R.drawable.arrow_forward)
    }
}