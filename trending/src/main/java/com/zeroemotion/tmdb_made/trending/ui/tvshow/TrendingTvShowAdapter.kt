package com.zeroemotion.tmdb_made.trending.ui.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.databinding.ItemTvShowBinding
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.utils.CustomOnClick
import com.zeroemotion.tmdb_made.trending.TrendingFragmentDirections

class TrendingTvShowAdapter :
    RecyclerView.Adapter<TrendingTvShowAdapter.TrendingTvShowViewHolder>(),
    CustomOnClick {

    private var listData = ArrayList<TvShow>()

    fun setData(newList: List<TvShow>?) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TrendingTvShowViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemTvShowBinding>(
            inflater, R.layout.item_tv_show, parent,
            false
        )
        return TrendingTvShowViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrendingTvShowViewHolder, position: Int) {
        holder.view.tvShow = listData[position]
        holder.view.listener = this
    }

    override fun getItemCount(): Int = listData.size

    class TrendingTvShowViewHolder(var view: ItemTvShowBinding) :
        RecyclerView.ViewHolder(view.root)

    override fun onClicked(v: View) {
        for (tv in listData) {
            if (v.tag == tv.id) {
                val action = TrendingFragmentDirections.actionTrendingToDetailTvShow(tv)
                Navigation.findNavController(v).navigate(action)
            }
        }
    }
}