package com.zeroemotion.tmdb_made.trending

import androidx.lifecycle.MutableLiveData
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase
import com.zeroemotion.tmdb_made.core.utils.BaseViewModel
import com.zeroemotion.tmdb_made.core.utils.RxUtils

class TrendingViewModel(private val movieUseCase: MovieUseCase) : BaseViewModel() {

    val dataMovie = MutableLiveData<List<Movie>>()
    val dataTvShow = MutableLiveData<List<TvShow>>()
    val loading = MutableLiveData<Boolean>()
    val error = MutableLiveData<Boolean>()

    fun getTrendingMovie() {
        loading.value = true
        disposable.add(
            movieUseCase.getTrendingMovie()
                .compose(RxUtils.applySingleAsync())
                .subscribe({
                    dataMovie.value = it
                    loading.value = false
                }, {
                    loading.value = false
                    error.value = true
                }
                )
        )
    }

    fun getTrendingTvShow() {
        loading.value = true
        disposable.add(
            movieUseCase.getTrendingTvShow()
                .compose(RxUtils.applySingleAsync())
                .subscribe({
                    dataTvShow.value = it
                    loading.value = false
                }, {
                    error.value = true
                    loading.value = false
                })
        )
    }

}