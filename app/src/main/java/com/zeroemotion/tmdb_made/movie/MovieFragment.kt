package com.zeroemotion.tmdb_made.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.data.Resource
import com.zeroemotion.tmdb_made.databinding.FragmentMovieBinding
import kotlinx.android.synthetic.main.fragment_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

class MovieFragment : Fragment() {

    private val viewModel: MovieViewModel by viewModel()
    private lateinit var dataBinding: FragmentMovieBinding
    private val movieAdapter = MovieAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvMovie.apply {
            adapter = movieAdapter
            layoutManager = GridLayoutManager(context, 2)
        }

        observeMovieList()

    }

    private fun observeMovieList() {
        viewModel.movieList.observe(viewLifecycleOwner, Observer { movie ->
            if (movie != null) {
                when (movie) {
                    is Resource.Loading -> movieLoading.visibility = View.VISIBLE
                    is Resource.Error -> {
                        movieLoading.visibility = View.GONE
                        movieError.visibility = View.VISIBLE
                    }
                    is Resource.Success -> {
                        movieLoading.visibility = View.GONE
                        movieError.visibility = View.GONE
                        rvMovie.visibility = View.VISIBLE
                        movieAdapter.setData(movie.data)
                    }
                }
            }
        })
    }

}