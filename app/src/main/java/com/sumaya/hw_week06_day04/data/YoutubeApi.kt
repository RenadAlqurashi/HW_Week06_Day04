package com.sumaya.hw_week06_day04.data

import com.sumaya.hw_week06_day04.data.modules.YoutubeData
import retrofit2.http.GET

interface YoutubeApi {
    @GET("home_feed")
    suspend fun fetchVideos(): YoutubeData
}