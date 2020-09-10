package com.zeroemotion.tmdb_made.favorite.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteTvShowBinding
import com.zeroemotion.tmdb_made.favorite.FavoriteViewModel
import kotlinx.android.synthetic.main.fragment_favorite_tv_show.*
import org.koin.android.viewmodel.ext.android.viewModel

class FavoriteTvShowFragment : Fragment() {

    private val viewModel: FavoriteViewModel by viewModel()
    private val tvShowAdapter = FavoriteTvShowAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite_tv_show,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvFavTvshow.apply {
            adapter = tvShowAdapter
            layoutManager = GridLayoutManager(context, 2)
        }

        observeFavoriteTvShow()
    }

    private fun observeFavoriteTvShow() {
        viewModel.tvShowFavorite.observe(viewLifecycleOwner, Observer { tvShow ->
            if (tvShow != null) {
                rvFavTvshow.visibility = View.VISIBLE
                tvShowFavError.visibility = View.GONE
                tvShowAdapter.setData(tvShow)
            } else {
                rvFavTvshow.visibility = View.GONE
                tvShowFavError.visibility = View.VISIBLE
            }
        })
    }

    override fun onDestroyView() {
        rvFavTvshow.adapter = null
        super.onDestroyView()
    }
}