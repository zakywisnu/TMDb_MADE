package com.zeroemotion.tmdb_made.core.data.source.local

import com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity
import com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity
import com.zeroemotion.tmdb_made.core.data.source.local.room.MovieDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource (private val movieDao: MovieDao){

    fun getAllMovie(): Flow<List<MovieEntity>> = movieDao.getAllMovie()
    fun getAllTvShow(): Flow<List<TvShowEntity>> = movieDao.getAllTvShow()
    fun getFavoriteMovie(): Flow<List<MovieEntity>> = movieDao.getFavoriteMovie()
    fun getFavoriteTvShow(): Flow<List<TvShowEntity>> = movieDao.getFavoriteTvShow()

    suspend fun insertMovie(movie: List<MovieEntity>) = movieDao.insertMovie(movie)
    suspend fun insertTvShow(tvShow: List<TvShowEntity>) = movieDao.insertTvShow(tvShow)

    fun setFavoriteMovie(movie: MovieEntity, state: Boolean){
        movie.isFavorite = state
        movieDao.updateFavoriteMovie(movie)
    }
    fun setFavoriteTvShow(tvShow: TvShowEntity,state: Boolean){
        tvShow.isFavorite = state
        movieDao.updateFavoriteTvShow(tvShow)
    }

}