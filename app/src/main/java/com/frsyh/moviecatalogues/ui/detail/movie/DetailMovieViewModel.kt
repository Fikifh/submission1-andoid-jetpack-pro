package com.frsyh.moviecatalogues.ui.detail.movie

import androidx.lifecycle.ViewModel
import com.frsyh.moviecatalogues.data.MovieEntity
import com.frsyh.moviecatalogues.utils.DataDummy
import kotlin.properties.Delegates

class DetailMovieViewModel: ViewModel() {
    private var movieId by Delegates.notNull<Int>()

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun getMovie() : MovieEntity {
        lateinit var movie : MovieEntity
        val moviesEntities = DataDummy.generateDummyMovie()
        for (movieEntity in moviesEntities) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }
}
