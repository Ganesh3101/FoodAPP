package com.bigapp.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bigapp.foodapp.adapters.SliderPagerAdapter
import com.bigapp.foodapp.adapters.ViewPageradapter
import com.google.android.material.tabs.TabLayoutMediator

class Appadvertisement_slider : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appadvertisement_slider)

        val viewPager2 = findViewById<ViewPager2>(R.id.slider_view)

        val adapter= SliderPagerAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter = adapter

    }


}
