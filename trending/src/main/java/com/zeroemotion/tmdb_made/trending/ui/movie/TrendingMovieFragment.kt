package com.zeroemotion.tmdb_made.trending.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.zeroemotion.tmdb_made.trending.R
import com.zeroemotion.tmdb_made.trending.TrendingViewModel
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingMovieBinding
import kotlinx.android.synthetic.main.fragment_trending_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

class TrendingMovieFragment : Fragment() {

    private lateinit var dataBinding: FragmentTrendingMovieBinding
    private val movieAdapter = TrendingMovieAdapter()
    private val viewModel: TrendingViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_trending_movie, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvTrendingMovie.apply {
            adapter = movieAdapter
            layoutManager = GridLayoutManager(context, 2)
        }

        viewModel.getTrendingMovie()

        observeTrendingMovie()
    }

    private fun observeTrendingMovie() {

        viewModel.dataMovie.observe(viewLifecycleOwner, Observer {
            movieAdapter.setData(it)
            rvTrendingMovie.visibility = View.VISIBLE
        })
        viewModel.loading.observe(viewLifecycleOwner, Observer { loading ->
            movieTrendingLoading.visibility = if (loading) View.VISIBLE else View.GONE
            if (loading) {
                movieTrendingError.visibility = View.GONE
                rvTrendingMovie.visibility = View.GONE
            }
        })
        viewModel.error.observe(viewLifecycleOwner, Observer { error ->
            movieTrendingError.visibility = if (error) View.VISIBLE else View.GONE
        })

    }

}