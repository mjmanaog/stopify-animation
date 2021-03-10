package com.mjmanaog.spotifyanimation.model

import com.mjmanaog.spotifyanimation.R

data class TrackModel(
        val trackImg : Int,
        val trackTitle : String,
        val trackArtist : String
)

val playlist = arrayListOf<TrackModel>(
        TrackModel(R.drawable.img_album, "Further", "Empirical"),
        TrackModel(R.drawable.img_album_1, "Under Linen", "clwn, Jack Homily"),
        TrackModel(R.drawable.img_album_2, "Corny", "Dad Jokes"),
        TrackModel(R.drawable.img_album_3, "Krispy", "Donuts"),
        TrackModel(R.drawable.img_album_4, "Dynasty", "Jaymes Old, Phoebe Yarn"),
        TrackModel(R.drawable.img_album_5, "Uhgg", "Luke ft. It's a bird"),
        TrackModel(R.drawable.img_album_6, "Do you know?", "Bon Jawawzki"),
        TrackModel(R.drawable.img_album_7, "I'm not alone", "Jericku Sucker"),
        TrackModel(R.drawable.img_album_6, "resign, resign", "Whack Milling"),
        TrackModel(R.drawable.img_album_4, "Trash it, Jonathan", "Lil Boga"),
        TrackModel(R.drawable.img_album_3, "Yo, Real Deal", "The False Blue"),
        TrackModel(R.drawable.img_album_2, "Further", "Empirical"),
        TrackModel(R.drawable.img_album_7, "Under Linen", "clwn, Jack Homily"),
        TrackModel(R.drawable.img_album_1, "Corny", "Dad Jokes"),
        TrackModel(R.drawable.img_album_6, "Krispy", "Donuts"),
        TrackModel(R.drawable.img_album, "Dynasty", "Jaymes Old, Phoebe Yarn"),
        TrackModel(R.drawable.img_album_5, "Uhgg", "Luke ft. It's a bird"),
        TrackModel(R.drawable.img_album_6, "Do you know?", "Bon Jawawzki"),
        TrackModel(R.drawable.img_album_7, "I'm not alone", "Jericku Sucker"),
        TrackModel(R.drawable.img_album_6, "resign, resign", "Whack Milling"),
        TrackModel(R.drawable.img_album_4, "Trash it, Jonathan", "Lil Boga"),
        TrackModel(R.drawable.img_album_3, "Yo, Real Deal", "The False Blue")

)