package com.example.forecast

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    internal lateinit var addCityIv: ImageView
    internal lateinit var moreIv: ImageView
    internal lateinit var pointLayout: LinearLayout
    internal lateinit var outLayout: RelativeLayout
    internal lateinit var mainVp: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addCityIv = findViewById(R.id.main_iv_add)
        moreIv = findViewById(R.id.main_iv_more)
        pointLayout = findViewById(R.id.main_layout_point)
        outLayout = findViewById(R.id.main_out_layout)
        mainVp = findViewById(R.id.main_vp)
        addCityIv.setOnClickListener { this }
        moreIv.setOnClickListener{ this }

    }
}

