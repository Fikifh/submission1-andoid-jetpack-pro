package com.frsyh.moviecatalogues.ui.detail.movie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(1)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
    }
}