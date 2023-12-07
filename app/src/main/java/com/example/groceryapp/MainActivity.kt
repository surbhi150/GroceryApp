package com.example.groceryapp

import android.content.ClipData.Item
import android.icu.util.ULocale.Category
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.groceryapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
//    lateinit var llMainActivity: MainActivity
    lateinit var navController: NavController
    lateinit var bottomView:BottomNavigationView
lateinit var binding: ActivityMainBinding
    var itemsList = arrayListOf<CategoryModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.list_item)
        binding.bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.itList->
                {
                navController.navigate(R.id.itemsList)
            }
            }
            return@setOnItemSelectedListener true
        }


    }
}