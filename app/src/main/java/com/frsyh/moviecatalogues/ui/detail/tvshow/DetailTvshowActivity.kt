package com.frsyh.moviecatalogues.ui.detail.tvshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.frsyh.moviecatalogues.R
import com.frsyh.moviecatalogues.data.TvShowEntity
import com.frsyh.moviecatalogues.databinding.ActivityDetailTvshowBinding
import com.frsyh.moviecatalogues.databinding.ContentDetailTvshowBinding

class DetailTvshowActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TVSHOW = 1
    }

    lateinit var detailContentBinding : ContentDetailTvshowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailTvshowBinding = ActivityDetailTvshowBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailTvshowBinding.detailContent

        setContentView(activityDetailTvshowBinding.root)

        setSupportActionBar(activityDetailTvshowBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvshowViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val tvshowId = extras.getInt(EXTRA_TVSHOW.toString())
            if (tvshowId != null) {
                viewModel.setSelectedTvshow(tvshowId)
                populateCourse(viewModel.getTvshow())
            }
        }
    }

    private fun populateCourse(tvshowEntity: TvShowEntity) {
        detailContentBinding.textTitle.text = tvshowEntity.title
        detailContentBinding.textDescription.text = tvshowEntity.overview
        detailContentBinding.textDate.text = resources.getString(R.string.release_date, tvshowEntity.release)

        Glide.with(this)
            .load(tvshowEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24)
                .error(R.drawable.ic_baseline_error_24))
            .into(detailContentBinding.imgPoster)
    }
}