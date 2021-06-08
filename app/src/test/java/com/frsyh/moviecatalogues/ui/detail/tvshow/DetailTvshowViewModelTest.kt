package com.frsyh.moviecatalogues.ui.detail.tvshow

import com.frsyh.moviecatalogues.ui.detail.movie.DetailMovieViewModel
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailTvshowViewModelTest {

    private lateinit var viewModel: DetailTvshowViewModel

    @Before
    fun setUp() {
        viewModel = DetailTvshowViewModel()
    }

    @Test
    fun getTvshow() {
        viewModel.setSelectedTvshow(1)
        val movieEntity = viewModel.getTvshow()
        assertNotNull(movieEntity)
    }
}