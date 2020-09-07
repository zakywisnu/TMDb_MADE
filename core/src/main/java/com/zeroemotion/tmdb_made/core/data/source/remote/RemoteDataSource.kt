package com.zeroemotion.tmdb_made.core.data.source.remote

import android.annotation.SuppressLint
import android.util.Log
import com.zeroemotion.tmdb_made.core.data.Resource
import com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiService
import com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse
import com.zeroemotion.tmdb_made.core.utils.DataMapper
import com.zeroemotion.tmdb_made.core.utils.MovieConstant.API_KEY
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

class RemoteDataSource(private val apiService: ApiService) {
    suspend fun getAllMovie(): Flow<ApiResponse<List<MovieResponse>>> {
        return flow {
            try {
                val response = apiService.getMovie(API_KEY)
                val dataArray = response.results
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getAllTvShow(): Flow<ApiResponse<List<TvShowResponse>>> {
        return flow {
            try {
                val response = apiService.getTvShow(API_KEY)
                val dataArray = response.results
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getTrendingMovie(): Single<ListResponse<MovieResponse>>{
        return apiService.getTrendingMovie(API_KEY)
    }

    fun getTrendingTvShow(): Single<ListResponse<TvShowResponse>>{
        return apiService.getTrendingTvShow(API_KEY)
    }

}