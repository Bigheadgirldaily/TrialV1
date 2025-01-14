package com.example.test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivitySummaryBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate called")
        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.octButton.setOnClickListener {
            Log.d("MainActivity", "octButton clicked")
            val intent = Intent(this, OctoberActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for other months similarly
    }
}