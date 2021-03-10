package com.mjmanaog.spotifyanimation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mjmanaog.spotifyanimation.model.TrackModel
import kotlinx.android.synthetic.main.item_song.view.*

class TrackViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

    fun bind(track: TrackModel) {
        root.tvTrackTitle.text = track.trackTitle
        root.tvArtist.text = track.trackArtist
        root.ivTrack.setImageResource(track.trackImg)
    }

}