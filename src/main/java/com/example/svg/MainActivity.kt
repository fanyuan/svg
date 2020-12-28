package com.example.svg

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.svg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        dataBinding.act = this

        //val d = ContextCompat.getDrawable(this,R.drawable.arrow_forward);


    }
    fun svg0(){
        startActivity(Intent(this,Svg0Activity::class.java))
    }
    fun svg1(){
        startActivity(Intent(this,Svg01Activity::class.java))
    }

//    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//        drawable = (DrawableCompat.wrap(drawable)).mutate();
//    }
}