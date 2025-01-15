package com.example.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityOctBinding

class OctoberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOctBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOctBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2025.setOnClickListener {
            finish() // This will close the current activity and return to the previous one
        }

        val addButton: ImageButton = findViewById(R.id.buttonAdd)
        addButton.setOnClickListener {
            showCustomPopup(addButton)
        }
    }

    private fun showCustomPopup(anchorView: View) {
        val popupView = LayoutInflater.from(this).inflate(R.layout.dialog_custom, null)
        val popupWindow = PopupWindow(popupView,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            true)

        // Calculate the offset in pixels (5cm = 50mm, 50cm = 500mm, 1 inch = 25.4mm, 1 inch = 160dp)
        val offset5cm = (5 / 25.4 * 160).toInt()
        val offset50cm = (50 / 25.4 * 160).toInt()

        // Adjust the position to ensure it is 5cm below the anchor view and 50cm away from the right-side boundary
        val rootView = binding.root
        rootView.post {
            val location = IntArray(2)
            rootView.getLocationOnScreen(location)
            val rootViewWidth = rootView.width
            val rootViewX = location[0]

            val anchorLocation = IntArray(2)
            anchorView.getLocationOnScreen(anchorLocation)
            val anchorX = anchorLocation[0]

            val xOffset = if (rootViewX + rootViewWidth - (anchorX + anchorView.width) < offset50cm) {
                -(offset50cm - (rootViewX + rootViewWidth - (anchorX + anchorView.width)))
            } else {
                0
            }

            popupWindow.showAsDropDown(anchorView, xOffset, offset5cm)
        }
    }
}