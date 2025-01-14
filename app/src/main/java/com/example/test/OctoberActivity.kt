package com.example.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityOctBinding

class OctoberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOctBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOctBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("OctoberActivity", "OctoberActivity created")

        binding.button2025.setOnClickListener {
            Log.d("OctoberActivity", "button2025 clicked")
            finish() // This will close the current activity and return to the previous one
        }
    }
}