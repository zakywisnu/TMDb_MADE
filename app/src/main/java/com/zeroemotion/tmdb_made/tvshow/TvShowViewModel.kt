package com.zeroemotion.tmdb_made.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase

class TvShowViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    val tvShowList = movieUseCase.getAllTvShow().asLiveData()

}