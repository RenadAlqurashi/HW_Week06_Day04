package com.sumaya.hw_week06_day04.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.data.modules.Videos

class RecyclerViewAdapter(val videodata: List<Videos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val viwe= LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)
        return CustomHolder(viwe)

    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videodata[position]
        holder.videoId.text = video.id.toString()
        holder.videoName.text = video.name
        holder.videoChannel.text = video.channel.name
        holder.videoViews.text = video.numberOfViews.toString()
        holder.videoImage.load(video.imageUrl)
    }

    override fun getItemCount(): Int {
        return videodata.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
val videoId: TextView = itemView.findViewById(R.id.videoId)
val videoName: TextView = itemView.findViewById(R.id.videoName)
val videoChannel: TextView = itemView.findViewById(R.id.channelName)
val videoViews: TextView = itemView.findViewById(R.id.numberOfViews)
val videoImage: ImageView = itemView.findViewById(R.id.imageUrl)
}
