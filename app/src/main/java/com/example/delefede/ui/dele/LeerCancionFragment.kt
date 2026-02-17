package com.example.delefede.ui.dele

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.delefede.R

class LeerCancionFragment : Fragment() {
    private var mediaPlayer: MediaPlayer? = null
    private var audioPath: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_leer_cancion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val titulo = arguments?.getString("titulo") ?: ""
        val letra = arguments?.getString("letra") ?: ""
        audioPath = arguments?.getString("audioPath")

        view.findViewById<TextView>(R.id.songTitle).text = titulo
        view.findViewById<TextView>(R.id.songLyrics).text = letra

        val playButton = view.findViewById<ImageButton>(R.id.playButton)
        val pauseButton = view.findViewById<ImageButton>(R.id.pauseButton)

        playButton.setOnClickListener {
            audioPath?.let {
                if (mediaPlayer == null) {
                    val afd = requireContext().assets.openFd(it)
                    mediaPlayer = MediaPlayer().apply {
                        setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                        prepare()
                        start()
                    }
                } else {
                    mediaPlayer?.start()
                }
            }
        }

        pauseButton.setOnClickListener {
            mediaPlayer?.pause()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
