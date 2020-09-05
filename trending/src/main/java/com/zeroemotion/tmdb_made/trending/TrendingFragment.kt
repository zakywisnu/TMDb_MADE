package com.zeroemotion.tmdb_made.trending

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingBinding
import com.zeroemotion.tmdb_made.trending.di.trendingModule
import org.koin.core.context.loadKoinModules

class TrendingFragment : Fragment() {

    private lateinit var dataBinding: FragmentTrendingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loadKoinModules(trendingModule)
        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_trending, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = context?.let { TrendingViewPager(it, childFragmentManager) }
        dataBinding.apply {
            trendingViewPager.adapter = pagerAdapter
            trendingTab.setupWithViewPager(trendingViewPager)
        }
    }

}