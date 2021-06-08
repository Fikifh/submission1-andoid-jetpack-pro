package com.frsyh.moviecatalogues.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.frsyh.moviecatalogues.R
import com.frsyh.moviecatalogues.data.TvShowEntity
import com.frsyh.moviecatalogues.databinding.ItemsTvshowBinding
import com.frsyh.moviecatalogues.ui.detail.tvshow.DetailTvshowActivity

class TvshowAdapter : RecyclerView.Adapter<TvshowAdapter.TvshowViewHolder>() {
    private var listTvshow = ArrayList<TvShowEntity>()

    fun setMovie(tvshow: List<TvShowEntity>?) {
        if (tvshow == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvshow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvshowViewHolder {
        val itemsAcademyBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvshowViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: TvshowViewHolder, position: Int) {
        val tvshow = listTvshow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvshow.size


    class TvshowViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TvShowEntity) {
            with(binding) {
                tvItemTitle.text = tvshow.title
                tvItemDate.text = itemView.resources.getString(R.string.release_date, tvshow.release)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvshowActivity::class.java)
                    intent.putExtra(DetailTvshowActivity.EXTRA_TVSHOW.toString(), tvshow.tvShowId)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(tvshow.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24)
                        .error(R.drawable.ic_baseline_error_24))
                    .into(imgPoster)
            }
        }
    }
}