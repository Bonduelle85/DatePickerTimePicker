package com.example.datepickertimepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.datepickertimepicker.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         // datePicker

        val date = Calendar.getInstance()
        binding.datePicker.init(
            date.get(Calendar.YEAR),
            date.get(Calendar.MONTH),
            date.get(Calendar.DAY_OF_MONTH)
        ) {view, year, monthOfYear, dayOfMonth ->
            val month = monthOfYear + 1
            val msg = "Selected Date is $dayOfMonth/$month/$year"
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }

        // timePicker

//        binding.timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
//            val dayHour = when {
//                hourOfDay == 0 -> {
//                    hourOfDay + 12
//                }
//                hourOfDay > 12 -> {
//                    hourOfDay - 12
//                }
//                else -> hourOfDay
//            }
//
//            val format = when {
//                hourOfDay >= 12 -> {
//                    "PM"
//                }
//                else -> "AM"
//            }
//
//            val hour = if (dayHour < 10) "0$dayHour" else dayHour
//            val min = if (minute < 10) "0$minute" else minute
//
//            val text = getString(R.string.selected_time) + " " + hour + " : " + min + " " + format
//            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
//        }
    }
}