package com.frsyh.moviecatalogues.ui.tvshow

import androidx.lifecycle.ViewModel
import com.frsyh.moviecatalogues.data.TvShowEntity
import com.frsyh.moviecatalogues.utils.DataDummy

class TvshowViewModel : ViewModel() {
    fun getTvshow() : List<TvShowEntity> = DataDummy.generateDummyTvShow()
}