package com.zeroemotion.tmdb_made.detail

import androidx.lifecycle.ViewModel
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase

class DetailViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) {
        movieUseCase.setFavoriteMovie(movie, newStatus)
    }

    fun setFavoriteTvShow(tvShow: TvShow, newStatus: Boolean) {
        movieUseCase.setFavoriteTvShow(tvShow, newStatus)
    }


}