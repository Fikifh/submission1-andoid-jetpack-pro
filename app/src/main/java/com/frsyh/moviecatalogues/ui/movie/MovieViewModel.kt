package com.frsyh.moviecatalogues.ui.movie

import androidx.lifecycle.ViewModel
import com.frsyh.moviecatalogues.data.MovieEntity
import com.frsyh.moviecatalogues.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies() : List<MovieEntity> = DataDummy.generateDummyMovie()
}