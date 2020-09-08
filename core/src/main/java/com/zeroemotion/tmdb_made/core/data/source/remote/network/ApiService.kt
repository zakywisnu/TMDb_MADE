package com.zeroemotion.tmdb_made.core.data.source.remote.network

import com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/3/movie/popular?")
    suspend fun getMovie(
        @Query("api_key") api_key: String
    ): ListResponse<MovieResponse>

    @GET("/3/tv/popular?")
    suspend fun getTvShow(
        @Query("api_key") api_key: String
    ): ListResponse<TvShowResponse>

    @GET("/3/trending/movie/day?")
    fun getTrendingMovie(
        @Query("api_key") api_key: String
    ): Single<ListResponse<MovieResponse>>

    @GET("/3/trending/tv/day?")
    fun getTrendingTvShow(
        @Query("api_key") api_key: String
    ): Single<ListResponse<TvShowResponse>>
}