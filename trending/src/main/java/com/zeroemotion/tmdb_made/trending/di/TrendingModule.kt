package com.zeroemotion.tmdb_made.trending.di

import com.zeroemotion.tmdb_made.trending.TrendingViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val trendingModule = module {
    viewModel { TrendingViewModel(get()) }
}