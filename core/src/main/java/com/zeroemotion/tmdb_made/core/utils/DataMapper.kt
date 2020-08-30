package com.zeroemotion.tmdb_made.core.utils

import com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity
import com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity
import com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse
import com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.domain.model.TvShow

object DataMapper {
    fun mapMovieResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                id = it.id,
                title = it.title,
                overview = it.overview,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                voteAverage = it.voteAverage,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapListMovieEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                id = it.id,
                title = it.title,
                overview = it.overview,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                voteAverage = it.voteAverage,
                isFavorite = it.isFavorite
            )
        }

    fun mapMovieEntityToDomain(input: MovieEntity): Movie = Movie(
        id = input.id,
        title = input.title,
        overview = input.overview,
        posterPath = input.posterPath,
        releaseDate = input.releaseDate,
        voteAverage = input.voteAverage,
        isFavorite = input.isFavorite
    )

    fun mapMovieDomainToEntity(input: Movie) = MovieEntity(
        id = input.id,
        title = input.title,
        overview = input.overview,
        posterPath = input.posterPath,
        releaseDate = input.releaseDate,
        voteAverage = input.voteAverage,
        isFavorite = input.isFavorite
    )

    fun mapTvShowResponseToEntities(input: List<TvShowResponse>): List<TvShowEntity> {
        val tvList = ArrayList<TvShowEntity>()
        input.map {
            val tv = TvShowEntity(
                id = it.id,
                name = it.name,
                overview = it.overview,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                voteAverage = it.voteAverage,
                isFavorite = false
            )
            tvList.add(tv)
        }
        return tvList
    }

    fun mapListTvShowEntitiesToDomain(input: List<TvShowEntity>): List<TvShow> =
        input.map {
            TvShow(
                id = it.id,
                name = it.name,
                overview = it.overview,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                voteAverage = it.voteAverage,
                isFavorite = it.isFavorite
            )
        }

    fun mapTvShowEntityToDomain(input: TvShowEntity): TvShow = TvShow(
        id = input.id,
        name = input.name,
        overview = input.overview,
        posterPath = input.posterPath,
        firstAirDate = input.firstAirDate,
        voteAverage = input.voteAverage,
        isFavorite = input.isFavorite
    )

    fun mapTvShowDomainToEntity(input: TvShow) = TvShowEntity(
        id = input.id,
        name = input.name,
        overview = input.overview,
        posterPath = input.posterPath,
        firstAirDate = input.firstAirDate,
        voteAverage = input.voteAverage,
        isFavorite = input.isFavorite
    )
}