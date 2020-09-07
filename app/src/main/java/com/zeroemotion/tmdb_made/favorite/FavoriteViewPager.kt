package com.zeroemotion.tmdb_made.favorite

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.favorite.movie.FavoriteMovieFragment
import com.zeroemotion.tmdb_made.favorite.tvshow.FavoriteTvShowFragment

class FavoriteViewPager(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    companion object {
        @StringRes
        private val TITLE_TAB = intArrayOf(R.string.favorite_movie, R.string.favorite_tv_show)
    }

    private val pages = listOf(
        FavoriteMovieFragment(),
        FavoriteTvShowFragment()
    )

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int): Fragment = pages[position]

    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(
        TITLE_TAB[position]
    )

}