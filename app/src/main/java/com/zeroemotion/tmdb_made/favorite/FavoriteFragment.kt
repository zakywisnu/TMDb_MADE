package com.zeroemotion.tmdb_made.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteBinding
import kotlinx.android.synthetic.main.fragment_favorite.*

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = context?.let { FavoriteViewPager(it, childFragmentManager) }
        favoriteViewPager.adapter = pagerAdapter
        favoriteTab.setupWithViewPager(favoriteViewPager)
    }

}