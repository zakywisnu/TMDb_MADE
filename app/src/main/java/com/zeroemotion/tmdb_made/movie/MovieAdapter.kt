package com.zeroemotion.tmdb_made.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.databinding.ItemMovieBinding
import com.zeroemotion.tmdb_made.core.domain.model.Movie
import com.zeroemotion.tmdb_made.core.utils.CustomOnClick
import com.zeroemotion.tmdb_made.home.HomeFragmentDirections

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(), CustomOnClick {

    private var listData = ArrayList<Movie>()

    fun setData(newList: List<Movie>?) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view =
            DataBindingUtil.inflate<ItemMovieBinding>(inflater, R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.view.movie = listData[position]
        holder.view.listener = this
    }

    override fun getItemCount(): Int = listData.size
    class MovieViewHolder(var view: ItemMovieBinding) : RecyclerView.ViewHolder(view.root)

    override fun onClicked(v: View) {
        for (movie in listData) {
            if (v.tag == movie.id) {
                val action = HomeFragmentDirections.actionHomeToDetailMovie(movie)
                Navigation.findNavController(v).navigate(action)
            }
        }
    }

}