package com.zeroemotion.tmdb_made.trending

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zeroemotion.tmdb_made.trending.ui.movie.TrendingMovieFragment
import com.zeroemotion.tmdb_made.trending.ui.tvshow.TrendingTvShowFragment

class TrendingViewPager(private val context: Context, fm: FragmentManager) : FragmentStatePagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    companion object {
        @StringRes
        private val TITLE_TAB = intArrayOf(R.string.trending_movie, R.string.trending_tv_show)
    }

    private val pages = listOf(
        TrendingMovieFragment(),
        TrendingTvShowFragment()
    )

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int): Fragment = pages[position]

    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(
        TITLE_TAB[position]
    )

}