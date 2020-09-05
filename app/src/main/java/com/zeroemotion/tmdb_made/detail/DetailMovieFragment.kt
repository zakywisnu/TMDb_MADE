package com.zeroemotion.tmdb_made.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.utils.getProgressDrawable
import com.zeroemotion.tmdb_made.core.utils.loadImage
import com.zeroemotion.tmdb_made.databinding.FragmentDetailMovieBinding
import kotlinx.android.synthetic.main.fragment_detail_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

class DetailMovieFragment : Fragment() {
    private val viewModel: DetailViewModel by viewModel()
    private var movies: Movie? = null
    private val args: DetailMovieFragmentArgs by navArgs()
    private lateinit var dataBinding: FragmentDetailMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_detail_movie, container, false)
        movies = args.movies
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let {
            dataBinding.detailMovieImage.loadImage(movies?.posterPath, getProgressDrawable(it))
        }
        dataBinding.movie = movies
        var status = movies?.isFavorite

        setStatusFavorite(status)

        fab_movie.setOnClickListener {
            status = !status!!
            movies?.let { it1 -> viewModel.setFavoriteMovie(it1, status!!) }
            setStatusFavorite(status)
        }
    }

    private fun setStatusFavorite(status: Boolean?) {
        if (status!!) {
            fab_movie.setImageDrawable(context?.let {
                ContextCompat.getDrawable(
                    it,
                    R.drawable.ic_favorite
                )
            })
        } else {
            fab_movie.setImageDrawable(context?.let {
                ContextCompat.getDrawable(
                    it,
                    R.drawable.ic_not_favorite
                )
            })
        }
    }

}