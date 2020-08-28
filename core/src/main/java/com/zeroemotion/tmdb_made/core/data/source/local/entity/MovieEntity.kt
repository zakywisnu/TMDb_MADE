package com.zeroemotion.tmdb_made.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class MovieEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "overview")
    var overview: String,
    @ColumnInfo(name = "poster_path")
    var posterPath: String,
    @ColumnInfo(name = "release_date")
    var releaseDate: String,
    @ColumnInfo(name = "vote_average")
    var voteAverage: String,
    @ColumnInfo(name = "is_favorite")
    var isFavorite: Boolean
)