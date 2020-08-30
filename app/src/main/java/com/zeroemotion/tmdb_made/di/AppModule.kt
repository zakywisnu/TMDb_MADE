package com.zeroemotion.tmdb_made.di

import com.zeroemotion.tmdb_made.detail.DetailViewModel
import com.zeroemotion.tmdb_made.favorite.FavoriteViewModel
import com.zeroemotion.tmdb_made.movie.MovieViewModel
import com.zeroemotion.tmdb_made.tvshow.TvShowViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MovieViewModel(get())}
    viewModel { TvShowViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
}