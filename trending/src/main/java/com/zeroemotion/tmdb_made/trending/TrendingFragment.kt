package com.zeroemotion.tmdb_made.trending

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingBinding
import com.zeroemotion.tmdb_made.trending.di.trendingModule
import kotlinx.android.synthetic.main.fragment_trending.*
import org.koin.core.context.loadKoinModules

class TrendingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loadKoinModules(trendingModule)
        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = context?.let { TrendingViewPager(it, childFragmentManager) }
        trendingViewPager.adapter = pagerAdapter
        trendingTab.setupWithViewPager(trendingViewPager)
    }

}