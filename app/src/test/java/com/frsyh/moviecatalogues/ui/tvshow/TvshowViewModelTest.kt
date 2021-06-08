package com.frsyh.moviecatalogues.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvshowViewModelTest {

    private lateinit var tvshowViewModel: TvshowViewModel

    @Before
    fun setUp() {
        tvshowViewModel = TvshowViewModel()
    }

    @Test
    fun getTvshow() {
        val tvshowEntities = tvshowViewModel.getTvshow()
        assertNotNull(tvshowEntities)
        assertEquals(12, tvshowEntities.size)
    }
}