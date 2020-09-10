package com.zeroemotion.tmdb_made.trending.ui.tvshow

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
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingTvShowBinding
import kotlinx.android.synthetic.main.fragment_trending_tv_show.*
import org.koin.android.viewmodel.ext.android.viewModel

class TrendingTvShowFragment : Fragment() {

    private val tvShowAdapter = TrendingTvShowAdapter()
    private val viewModel: TrendingViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_trending_tv_show,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvTrendingTvshow.apply {
            adapter = tvShowAdapter
            layoutManager = GridLayoutManager(context, 2)
        }

        viewModel.getTrendingTvShow()

        observeTrendingTvShow()
    }

    private fun observeTrendingTvShow() {
        viewModel.dataTvShow.observe(viewLifecycleOwner, Observer {
            tvShowAdapter.setData(it)
            rvTrendingTvshow.visibility = View.VISIBLE
        })
        viewModel.loading.observe(viewLifecycleOwner, Observer { loading ->
            tvShowTrendingLoading.visibility = if (loading) View.VISIBLE else View.GONE
            if (loading) {
                tvShowTrendingError.visibility = View.GONE
                rvTrendingTvshow.visibility = View.GONE
            }
        })
        viewModel.error.observe(viewLifecycleOwner, Observer { error ->
            tvShowTrendingError.visibility = if (error) View.VISIBLE else View.GONE
        })
    }

    override fun onDestroyView() {
        rvTrendingTvshow.adapter = null
        super.onDestroyView()
    }
}