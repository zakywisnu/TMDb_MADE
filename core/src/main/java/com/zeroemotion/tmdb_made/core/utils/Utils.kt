package com.zeroemotion.tmdb_made.core.utils

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zeroemotion.tmdb_made.core.R
import com.zeroemotion.tmdb_made.core.utils.MovieConstant.BASE_IMAGE_URL

fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

fun ImageView.loadImage(uri: String?, progressDrawable: CircularProgressDrawable) {
    val option = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.mipmap.ic_error)
    Glide.with(context)
        .setDefaultRequestOptions(option)
        .load(BASE_IMAGE_URL + uri)
        .into(this)
}

@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, urlString: String?) {
    view.loadImage(urlString, getProgressDrawable(view.context))
}