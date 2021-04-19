package com.bigapp.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bigapp.foodapp.adapters.ViewPageradapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Registartion_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registartion__page)

        val tabLayout = findViewById<TabLayout>(R.id.tab_log_reg)
        val viewPager2 = findViewById<ViewPager2>(R.id.log_reg_view)

        val adapter= ViewPageradapter(supportFragmentManager,lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager2)
        {tab,position->
            when(position)
            {
                0->
                {
                    tab.text="User"
                }
                1->
                {
                    tab.text="Owner"
                }
            }
        }.attach()
    }


}