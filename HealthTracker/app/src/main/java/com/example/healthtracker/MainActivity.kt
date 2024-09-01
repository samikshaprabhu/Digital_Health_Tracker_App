package com.example.healthtracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etMorningRoutine: EditText
    private lateinit var etPhysicalActivity: EditText
    private lateinit var etGoodSleep: EditText
    private lateinit var etCaloriesIntake: EditText
    private lateinit var btnSave: Button
    private lateinit var tvSummaryDetails: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etMorningRoutine = findViewById(R.id.etMorningRoutine)
        etPhysicalActivity = findViewById(R.id.etPhysicalActivity)
        etGoodSleep = findViewById(R.id.etGoodSleep)
        etCaloriesIntake = findViewById(R.id.etCaloriesIntake)
        btnSave = findViewById(R.id.btnSave)
        tvSummaryDetails = findViewById(R.id.tvSummaryDetails)

        btnSave.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val morningRoutine = etMorningRoutine.text.toString()
        val physicalActivity = etPhysicalActivity.text.toString()
        val goodSleep = etGoodSleep.text.toString()
        val caloriesIntake = etCaloriesIntake.text.toString()

        val summary = """
            Morning Routine: $morningRoutine
            Physical Activity: $physicalActivity
            Good Sleep: $goodSleep hours
            Calories Intake: $caloriesIntake kcal
        """.trimIndent()

        tvSummaryDetails.text = summary
    }
}