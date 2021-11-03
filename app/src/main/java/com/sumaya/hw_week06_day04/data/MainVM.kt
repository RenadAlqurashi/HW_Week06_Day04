package com.sumaya.hw_week06_day04.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.data.modules.YoutubeData
import kotlinx.coroutines.launch

class MainVM:ViewModel() {
    val repo = YoutubeRepo()
    fun fetchInterestingList() : LiveData<YoutubeData> {
        val videos = MutableLiveData<YoutubeData>()
        viewModelScope.launch {
            videos.postValue(repo.fetchInterestingList())
        }
        return videos
    }

}