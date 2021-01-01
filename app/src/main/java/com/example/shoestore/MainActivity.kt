package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.databinding.ActivityMainBinding
import com.example.shoestore.models.ShoeListViewModel

import timber.log.Timber

class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listViewModel: ShoeListViewModel by viewModels()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.shoeViewModel = listViewModel

        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)

        Timber.plant(Timber.DebugTree())
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }
}