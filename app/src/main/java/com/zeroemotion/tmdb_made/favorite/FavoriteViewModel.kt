package com.zeroemotion.tmdb_made.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase

class FavoriteViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    val movieFavorite = movieUseCase.getFavoriteMovie().asLiveData()
    val tvShowFavorite = movieUseCase.getFavoriteTvShow().asLiveData()

}