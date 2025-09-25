package com.example.actividad_semana_8

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ServicesActivity: AppCompatActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R. layout.activity_services)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.set0nClickListener { finish() }
    }
}
