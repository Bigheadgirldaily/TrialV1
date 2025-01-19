package com.example.test

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addschedule)

        val buttonRepeatRight: Button = findViewById(R.id.textRepeatRight)
        val buttonReminder: Button = findViewById(R.id.buttonReminder)

        buttonRepeatRight.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_repeat)

            val buttonNever: Button = dialog.findViewById(R.id.buttonNever)
            val buttonDaily: Button = dialog.findViewById(R.id.buttonDaily)
            val buttonWeekly: Button = dialog.findViewById(R.id.buttonWeekly)
            val buttonEvery2Weeks: Button = dialog.findViewById(R.id.buttonEvery2Weeks)
            val buttonMonthly: Button = dialog.findViewById(R.id.buttonMonthly)
            val buttonYearly: Button = dialog.findViewById(R.id.buttonYearly)
            val buttonCustom: Button = dialog.findViewById(R.id.buttonCustom)

            val buttons = listOf(buttonNever, buttonDaily, buttonWeekly, buttonEvery2Weeks, buttonMonthly, buttonYearly, buttonCustom)

            for (button in buttons) {
                button.setOnClickListener {
                    buttonRepeatRight.text = button.text
                    dialog.dismiss()
                }
            }

            dialog.show()
        }

        buttonReminder.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_reminder)

            val buttonNone: Button = dialog.findViewById(R.id.buttonNone)
            val buttonStartOfEvent: Button = dialog.findViewById(R.id.buttonStartOfEvent)
            val button5MinutesBefore: Button = dialog.findViewById(R.id.button5MinutesBefore)
            val button10MinutesBefore: Button = dialog.findViewById(R.id.button10MinutesBefore)
            val button15MinutesBefore: Button = dialog.findViewById(R.id.button15MinutesBefore)
            val button30MinutesBefore: Button = dialog.findViewById(R.id.button30MinutesBefore)
            val button1HourBefore: Button = dialog.findViewById(R.id.button1HourBefore)
            val button2HoursBefore: Button = dialog.findViewById(R.id.button2HoursBefore)
            val button1DayBefore: Button = dialog.findViewById(R.id.button1DayBefore)
            val button2DaysBefore: Button = dialog.findViewById(R.id.button2DaysBefore)
            val button1WeekBefore: Button = dialog.findViewById(R.id.button1WeekBefore)

            val buttons = listOf(buttonNone, buttonStartOfEvent, button5MinutesBefore, button10MinutesBefore, button15MinutesBefore, button30MinutesBefore, button1HourBefore, button2HoursBefore, button1DayBefore, button2DaysBefore, button1WeekBefore)

            for (button in buttons) {
                button.setOnClickListener {
                    buttonReminder.text = button.text
                    dialog.dismiss()
                }
            }

            dialog.show()
        }
    }
}