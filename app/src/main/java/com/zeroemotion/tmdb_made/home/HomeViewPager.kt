package com.zeroemotion.tmdb_made.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.movie.MovieFragment
import com.zeroemotion.tmdb_made.tvshow.TvShowFragment

class HomeViewPager(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    companion object {
        @StringRes
        private val TITLE_TAB = intArrayOf(R.string.movie, R.string.tv_show)
    }

    private val pages = listOf(
        MovieFragment(),
        TvShowFragment()
    )

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int): Fragment = pages[position]

    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(
        TITLE_TAB[position]
    )

}