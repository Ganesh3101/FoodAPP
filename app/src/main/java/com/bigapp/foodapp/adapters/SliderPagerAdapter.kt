package com.bigapp.foodapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bigapp.foodapp.fragment.*

class SliderPagerAdapter(fragmentmanager : FragmentManager, lifecycle : Lifecycle): FragmentStateAdapter(fragmentmanager,lifecycle)
{
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

       return when(position)
        {
            0->
            {
                page1()
            }
            1->
            {
                page2()
            }
            2->
            {
                page3()
            }
           else->
           {
               Fragment()
           }
        }
    }

}
