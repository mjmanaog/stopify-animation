package com.mjmanaog.spotifyanimation

import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mjmanaog.spotifyanimation.adapter.TrackAdapter
import com.mjmanaog.spotifyanimation.model.playlist
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var trackAdapter: TrackAdapter =
        TrackAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvMain.adapter = trackAdapter
        trackAdapter.addAll(playlist)
    }
}