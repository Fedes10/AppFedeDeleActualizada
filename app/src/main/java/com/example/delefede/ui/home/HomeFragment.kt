package com.example.delefede.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.delefede.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Animación futurista para bienvenida
        val welcomeTitle = view.findViewById<android.widget.TextView>(R.id.welcomeTitle)
        val welcomeDesc = view.findViewById<android.widget.TextView>(R.id.welcomeDesc)
        welcomeTitle?.animate()?.alpha(1f)?.setDuration(900)?.setStartDelay(200)?.start()
        welcomeDesc?.animate()?.alpha(1f)?.setDuration(1200)?.setStartDelay(900)?.start()
    }
}
