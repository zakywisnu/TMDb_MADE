package com.zeroemotion.tmdb_made.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.utils.getProgressDrawable
import com.zeroemotion.tmdb_made.core.utils.loadImage
import com.zeroemotion.tmdb_made.databinding.FragmentDetailTvShowBinding
import kotlinx.android.synthetic.main.fragment_detail_movie.*
import kotlinx.android.synthetic.main.fragment_detail_tv_show.*
import org.koin.android.viewmodel.ext.android.viewModel

class DetailTvShowFragment : Fragment() {

    private val viewModel: DetailViewModel by viewModel()
    private var tvShows: TvShow? = null
    private val args: DetailTvShowFragmentArgs by navArgs()
    private lateinit var dataBinding: FragmentDetailTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail_tv_show, container, false)
        tvShows = args.tvshow
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let {
            dataBinding.detailTvShowImage.loadImage(tvShows?.posterPath, getProgressDrawable(it))
        }
        dataBinding.tvShow = tvShows

        var status = tvShows?.isFavorite

        setStatusFavorite(status)

        fab_tv_show.setOnClickListener{
            status = !status!!
            tvShows?.let { it1 -> viewModel.setFavoriteTvShow(it1, status!!) }
            setStatusFavorite(status)
        }

    }

    private fun setStatusFavorite(status: Boolean?) {
        if (status!!){
            fab_tv_show.setImageDrawable(context?.let { ContextCompat.getDrawable(it,R.drawable.ic_favorite) })
        } else{
            fab_tv_show.setImageDrawable(context?.let { ContextCompat.getDrawable(it,R.drawable.ic_not_favorite) })
        }

    }
}