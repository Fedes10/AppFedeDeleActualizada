package com.example.delefede.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.example.delefede.R
import android.widget.Button
import androidx.navigation.fragment.findNavController

class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = requireActivity()
            .supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment)
            ?.childFragmentManager
            ?.fragments
            ?.firstOrNull()
            ?.let { (it as? androidx.navigation.fragment.NavHostFragment)?.navController }
            ?: findNavController()

        view.findViewById<Button>(R.id.cancioneroButton)?.setOnClickListener {
            navController.navigate(R.id.deleFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.guadalupeButton)?.setOnClickListener {
            navController.navigate(R.id.guadalupeFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.fatimaButton)?.setOnClickListener {
            navController.navigate(R.id.fatimaFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.inmaculadaButton)?.setOnClickListener {
            navController.navigate(R.id.inmaculadaFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.contactButton)?.setOnClickListener {
            navController.navigate(R.id.contactFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.aboutButton)?.setOnClickListener {
            navController.navigate(R.id.aboutFragment)
            dismiss()
        }
        view.findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            navController.navigate(R.id.loginFragment)
            dismiss()
        }
    }
}
