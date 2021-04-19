package com.bigapp.foodapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bigapp.foodapp.fragment.Registration_fragment
import com.bigapp.foodapp.fragment.Registration_owner_fragment

class ViewPageradapter(fragmentmanager : FragmentManager , lifecycle : Lifecycle): FragmentStateAdapter(fragmentmanager,lifecycle)
{
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

       return when(position)
        {
            0->
            {
                Registration_fragment()
            }
            1->
            {
                Registration_owner_fragment()
            }
            else->
            {
                Fragment()
            }
        }
    }

}
