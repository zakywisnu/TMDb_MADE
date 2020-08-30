package com.zeroemotion.tmdb_made.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_favorite.*

class HomeFragment : Fragment() {

    private lateinit var dataBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = context?.let { HomeViewPager(it,childFragmentManager) }
        dataBinding.apply {
            homeViewPager.adapter = pagerAdapter
            homeTab.setupWithViewPager(homeViewPager)
        }

    }

}