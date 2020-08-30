package com.zeroemotion.tmdb_made.core.data.source.local.room

import androidx.room.*

import com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity
import com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Query("select * from movie")
    fun getAllMovie(): Flow<List<MovieEntity>>

    @Query("select * from tv_show")
    fun getAllTvShow(): Flow<List<TvShowEntity>>

    @Query("select * from movie where id = :id")
    fun getMovieDetail(id: Int): Flow<MovieEntity>

    @Query("select * from tv_show where id = :id")
    fun getTvShowDetail(id: Int): Flow<TvShowEntity>

    @Query("select * from movie where is_favorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Query("select * from tvshow where is_favorite = 1")
    fun getFavoriteTvShow(): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<MovieEntity>)
 
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvShow(tvShow: List<TvShowEntity>)

    @Update
    fun updateFavoriteMovie(movie: MovieEntity)

    @Update
    fun updateFavoriteTvShow(tvShow: TvShowEntity)
}