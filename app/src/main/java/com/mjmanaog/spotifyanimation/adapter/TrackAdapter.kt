package com.mjmanaog.spotifyanimation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mjmanaog.spotifyanimation.R
import com.mjmanaog.spotifyanimation.model.TrackModel

class TrackAdapter : RecyclerView.Adapter<TrackViewHolder>() {

    private var trackList: MutableList<TrackModel> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_song, parent, false)
        return TrackViewHolder(
                layoutInflater
        )
    }

    override fun getItemCount(): Int {
        return trackList.size
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): TrackModel {
        return trackList[position]
    }

    fun addAll(trackList: List<TrackModel>) {
        this.trackList.clear()
        this.trackList.addAll(trackList)
        notifyDataSetChanged()
    }
}