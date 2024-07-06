package com.example.b18_layoutvsviewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                fragment1()
            }

            1 -> {
                Fragment2()
            }

            2 -> {
                Fragment3()
            }

            3 -> {
                Fragment4()
            }

            else -> {
                Fragment5()
            }

        }

    }
}