package com.zeroemotion.tmdb_made.core.data

import android.util.Log
import com.zeroemotion.tmdb_made.core.data.source.local.LocalDataSource
import com.zeroemotion.tmdb_made.core.data.source.remote.RemoteDataSource
import com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.domain.repository.IMovieRepository
import com.zeroemotion.tmdb_made.core.utils.AppExecutors
import com.zeroemotion.tmdb_made.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MovieRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : IMovieRepository {
    override fun getAllMovie(): Flow<Resource<List<Movie>>> {
        return object : NetworkBoundResource<List<Movie>, List<MovieResponse>>() {
            override fun loadFromDB(): Flow<List<Movie>> {
                return localDataSource.getAllMovie().map {
                    DataMapper.mapListMovieEntitiesToDomain(it)
                }
            }
            override fun shouldFetch(data: List<Movie>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getAllMovie()

            override suspend fun saveCallResult(data: List<MovieResponse>) {
                val movieList = DataMapper.mapMovieResponsesToEntities(data)
                localDataSource.insertMovie(movieList)
            }
        }.asFlow()
    }

    override fun getAllTvShow(): Flow<Resource<List<TvShow>>> {
        return object : NetworkBoundResource<List<TvShow>, List<TvShowResponse>>() {
            override fun loadFromDB(): Flow<List<TvShow>> {
                return localDataSource.getAllTvShow().map {
                    DataMapper.mapListTvShowEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<TvShow>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TvShowResponse>>> =
                remoteDataSource.getAllTvShow()

            override suspend fun saveCallResult(data: List<TvShowResponse>) {
                val tvList = DataMapper.mapTvShowResponseToEntities(data)
                localDataSource.insertTvShow(tvList)
            }
        }.asFlow()
    }
    override fun getMovieDetail(id: Int): Flow<Movie> =
        localDataSource.getMovieDetail(id).map {
            DataMapper.mapMovieEntityToDomain(it)
        }

    override fun getTvShowDetail(id: Int): Flow<TvShow> =
        localDataSource.getTvShowDetail(id).map {
            DataMapper.mapTvShowEntityToDomain(it)
        }

    override fun getFavoriteMovie(): Flow<List<Movie>> {
        return localDataSource.getFavoriteMovie().map {
            DataMapper.mapListMovieEntitiesToDomain(it)
        }
    }

    override fun getFavoriteTvShow(): Flow<List<TvShow>> {
        return localDataSource.getFavoriteTvShow().map {
            DataMapper.mapListTvShowEntitiesToDomain(it)
        }
    }

    override fun setFavoriteMovie(movie: Movie, state: Boolean) {
        val movieEntity = DataMapper.mapMovieDomainToEntity(movie)
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movieEntity, state) }
    }

    override fun setFavoriteTvShow(tvShow: TvShow, state: Boolean) {
        val tvEntity = DataMapper.mapTvShowDomainToEntity(tvShow)
        appExecutors.diskIO().execute { localDataSource.setFavoriteTvShow(tvEntity, state) }
    }

}