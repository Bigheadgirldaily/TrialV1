package com.example.test

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityCalendarBinding

class OctoberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button2025: Button = findViewById(R.id.button2025)
        val buttonSearch: ImageButton = findViewById(R.id.buttonSearch)
        val buttonAdd: ImageButton = findViewById(R.id.buttonAdd)

        button2025.setOnClickListener {
            Log.d("OctoberActivity", "2025 button clicked")
            // Handle 2025 button click
        }

        buttonSearch.setOnClickListener {
            Log.d("OctoberActivity", "Search button clicked")
            // Handle search button click
        }

        buttonAdd.setOnClickListener {
            Log.d("OctoberActivity", "Add button clicked")
            // Handle add button click
        }
    }
}