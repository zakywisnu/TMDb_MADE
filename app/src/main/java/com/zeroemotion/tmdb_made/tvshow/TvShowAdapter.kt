package com.zeroemotion.tmdb_made.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.zeroemotion.tmdb_made.R
import com.zeroemotion.tmdb_made.core.domain.model.TvShow
import com.zeroemotion.tmdb_made.core.utils.CustomOnClick
import com.zeroemotion.tmdb_made.databinding.ItemTvShowBinding

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(),CustomOnClick {

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
    ): TvShowViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemTvShowBinding>(
            inflater,
            R.layout.item_tv_show,
            parent,
            false
        )
        return TvShowViewHolder(view)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.view.tvShow = listData[position]
        holder.view.listener = this
    }

    override fun getItemCount(): Int = listData.size

    class TvShowViewHolder(var view: ItemTvShowBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onClicked(v: View) {
        TODO("Not yet implemented")
    }
}