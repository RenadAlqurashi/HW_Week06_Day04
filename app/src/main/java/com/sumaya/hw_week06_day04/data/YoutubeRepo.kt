package com.sumaya.hw_week06_day04.data

import com.sumaya.hw_week06_day04.data.modules.YoutubeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    val api = YoutubeBuilder.youtubeApi

    suspend fun fetchInterestingList(): YoutubeData = withContext(Dispatchers.IO) {
        api.fetchVideos()
    }
}