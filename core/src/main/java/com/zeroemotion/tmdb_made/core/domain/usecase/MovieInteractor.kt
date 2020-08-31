package com.zeroemotion.tmdb_made.core.domain.usecase

import com.zeroemotion.tmdb_made.core.data.Resource
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val movieRepository: IMovieRepository) : MovieUseCase {
    override fun getAllMovie(): Flow<Resource<List<Movie>>> = movieRepository.getAllMovie()

    override fun getAllTvShow(): Flow<Resource<List<TvShow>>> = movieRepository.getAllTvShow()

    override fun getFavoriteMovie(): Flow<List<Movie>> = movieRepository.getFavoriteMovie()

    override fun getFavoriteTvShow(): Flow<List<TvShow>> = movieRepository.getFavoriteTvShow()

    override fun setFavoriteMovie(movie: Movie, state: Boolean) =
        movieRepository.setFavoriteMovie(movie, state)

    override fun setFavoriteTvShow(tvShow: TvShow, state: Boolean) =
        movieRepository.setFavoriteTvShow(tvShow, state)

}