package com.zeroemotion.tmdb_made.core.data.source.remote.network

import com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse
import com.zeroemotion.tmdb_made.core.utils.MovieConstant.API_KEY
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular?")
    suspend fun getMovie(
        @Query("api_key") api_key: String,
    ): ListResponse<MovieResponse>

    @GET("tv/popular?")
    suspend fun getTvShow(
        @Query("api_key") api_key: String,
    ): ListResponse<TvShowResponse>
}