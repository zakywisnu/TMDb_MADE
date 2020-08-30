package com.zeroemotion.tmdb_made.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase

class MovieViewModel (private val movieUseCase: MovieUseCase): ViewModel(){

    val movieList = movieUseCase.getAllMovie().asLiveData()

}