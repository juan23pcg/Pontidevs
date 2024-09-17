package com.example.emprendenow

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.emprendenow.databinding.ActivityLogIn2Binding

class LogInActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLogIn2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogIn2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}