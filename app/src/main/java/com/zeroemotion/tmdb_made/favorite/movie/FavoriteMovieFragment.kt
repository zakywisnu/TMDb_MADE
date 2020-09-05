package com.zeroemotion.tmdb_made.favorite.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteMovieBinding
import com.zeroemotion.tmdb_made.favorite.FavoriteViewModel
import kotlinx.android.synthetic.main.fragment_favorite_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

class FavoriteMovieFragment : Fragment() {

    private val viewModel: FavoriteViewModel by viewModel()
    private lateinit var dataBinding: FragmentFavoriteMovieBinding
    private val movieAdapter = FavoriteMovieAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_favorite_movie, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvFavMovie.apply {
            adapter = movieAdapter
            layoutManager = GridLayoutManager(context, 2)
        }

        observeFavoriteMovie()

    }

    private fun observeFavoriteMovie() {
        viewModel.movieFavorite.observe(viewLifecycleOwner, Observer { movie ->
            movieAdapter.setData(movie)
        })
    }
}