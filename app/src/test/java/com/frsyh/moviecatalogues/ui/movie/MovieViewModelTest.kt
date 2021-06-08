package com.frsyh.moviecatalogues.ui.movie

import androidx.lifecycle.ViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {

    private lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val movieEntities = movieViewModel.getMovies()
        assertNotNull(movieEntities)
        assertEquals(12, movieEntities.size)
    }
}