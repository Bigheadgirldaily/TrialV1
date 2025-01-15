package com.example.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityAddscheduleBinding

class AddScheduleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddscheduleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddscheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRepeat.setOnClickListener {
            showRepeatPopup(it)
        }
    }

    private fun showRepeatPopup(anchorView: View) {
        val popupView = LayoutInflater.from(this).inflate(R.layout.dialog_repeat, null)
        val popupWindow = PopupWindow(popupView,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            true)

        popupWindow.showAsDropDown(anchorView, 0, 0)
    }
}