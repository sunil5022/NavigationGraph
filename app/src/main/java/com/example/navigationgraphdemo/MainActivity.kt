package com.example.navigationgraphdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationgraphdemo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
//        setContentView(R.layout.activity_main)

        setUpNavigationController()

    }

    private fun setUpNavigationController() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFrameLayout) as NavHostFragment
        val navController = navHostFragment.navController
        binding?.bottomNavigation!!.setupWithNavController(navController)

        val navView: BottomNavigationView = binding?.bottomNavigation!!

        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            val isMenuFragment = destination.id == R.id.navigation_home
                    || destination.id == R.id.navigation_home
                    || destination.id == R.id.navigation_second
                    || destination.id == R.id.navigation_third
                    || destination.id == R.id.myDialog

            if (isMenuFragment) {
                navView.visibility= View.VISIBLE
            } else  navView.visibility= View.GONE
        }

    }

}