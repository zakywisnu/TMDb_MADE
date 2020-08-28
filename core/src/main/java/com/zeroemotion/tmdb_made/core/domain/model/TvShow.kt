package com.zeroemotion.tmdb_made.core.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShow(
    val id: Int,
    val name: String,
    val overview: String,
    val posterPath: String,
    val firstAirDate: String,
    val voteAverage: String
) : Parcelable