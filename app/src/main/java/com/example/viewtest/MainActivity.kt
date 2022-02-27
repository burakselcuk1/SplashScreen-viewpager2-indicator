package com.example.viewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = adapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        binding.indicator.setViewPager2(binding.viewPager)


    }
}