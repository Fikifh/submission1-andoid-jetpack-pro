package com.frsyh.moviecatalogues.ui.detail.tvshow

import androidx.lifecycle.ViewModel
import com.frsyh.moviecatalogues.data.TvShowEntity
import com.frsyh.moviecatalogues.utils.DataDummy
import kotlin.properties.Delegates

class DetailTvshowViewModel: ViewModel() {
    private var tvshowId by Delegates.notNull<Int>()

    fun setSelectedTvshow(tvshowId: Int) {
        this.tvshowId = tvshowId
    }

    fun getTvshow() : TvShowEntity {
        lateinit var tvshow : TvShowEntity
        val tvshowsEntities = DataDummy.generateDummyTvShow()
        for (tvshowEntity in tvshowsEntities) {
            if (tvshowEntity.tvShowId == tvshowId) {
                tvshow = tvshowEntity
            }
        }
        return tvshow
    }
}
