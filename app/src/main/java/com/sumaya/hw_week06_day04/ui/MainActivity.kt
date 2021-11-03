package com.sumaya.hw_week06_day04.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.data.MainVM

class MainActivity : AppCompatActivity() {
    private lateinit var youtubeRV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainVM::class.java)

        youtubeRV=findViewById(R.id.recyclerView)
        youtubeRV.layoutManager = LinearLayoutManager(this)

        vm.fetchInterestingList().observe(this,{
            youtubeRV.adapter = RecyclerViewAdapter(it.videos)
            Log.d("main",it.videos.toString())
        })
    }
}