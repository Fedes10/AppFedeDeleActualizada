package com.example.delefede

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

import android.widget.Button
import com.google.android.material.button.MaterialButton
import com.example.delefede.ui.menu.MenuBottomSheetFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val navHome = findViewById<android.widget.ImageView>(R.id.navHome)
        val navSearch = findViewById<android.widget.ImageView>(R.id.navSearch)
        val navAdd = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.navAdd)
        val navHistory = findViewById<android.widget.ImageView>(R.id.navHistory)
        val navProfile = findViewById<android.widget.ImageView>(R.id.navProfile)

        navHome?.setOnClickListener {
            if (navController.currentDestination?.id != R.id.homeFragment) {
                navController.navigate(R.id.homeFragment)
            }
        }
        navSearch?.setOnClickListener {
            if (navController.currentDestination?.id != R.id.guadalupeFragment) {
                navController.navigate(R.id.guadalupeFragment)
            }
        }
        navAdd?.setOnClickListener {
            MenuBottomSheetFragment().show(supportFragmentManager, "MenuBottomSheet")
        }
        navHistory?.setOnClickListener {
            if (navController.currentDestination?.id != R.id.deleFragment) {
                navController.navigate(R.id.deleFragment)
            }
        }
        navProfile?.setOnClickListener {
            if (navController.currentDestination?.id != R.id.loginFragment) {
                navController.navigate(R.id.loginFragment)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}