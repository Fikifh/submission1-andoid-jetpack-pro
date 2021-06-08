package com.frsyh.moviecatalogues.ui.detail.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.frsyh.moviecatalogues.R
import com.frsyh.moviecatalogues.data.MovieEntity
import com.frsyh.moviecatalogues.databinding.ActivityDetailMovieBinding
import com.frsyh.moviecatalogues.databinding.ContentDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = 1
    }

    lateinit var detailContentBinding : ContentDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailMovieBinding.detailContent

        setContentView(activityDetailMovieBinding.root)

        setSupportActionBar(activityDetailMovieBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getInt(EXTRA_MOVIE.toString())
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                populateCourse(viewModel.getMovie())
            }
        }
    }

    private fun populateCourse(movieEntity: MovieEntity) {
        detailContentBinding.textTitle.text = movieEntity.title
        detailContentBinding.textDescription.text = movieEntity.overview
        detailContentBinding.textDate.text = resources.getString(R.string.release_date, movieEntity.release)

        Glide.with(this)
            .load(movieEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh_24)
                .error(R.drawable.ic_baseline_error_24))
            .into(detailContentBinding.imgPoster)
    }
}