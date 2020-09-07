package com.zeroemotion.tmdb_made.core.domain.usecase

import com.zeroemotion.tmdb_made.core.data.Resource
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getAllMovie(): Flow<Resource<List<Movie>>>
    fun getAllTvShow(): Flow<Resource<List<TvShow>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun getFavoriteTvShow(): Flow<List<TvShow>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
    fun setFavoriteTvShow(tvShow: TvShow, state: Boolean)
    fun getTrendingMovie(): Single<List<Movie>>
    fun getTrendingTvShow(): Single<List<TvShow>>
}