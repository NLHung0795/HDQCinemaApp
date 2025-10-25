package com.example.hdqcinema

import android.app.Activity
import android.content.Intent
import kotlin.jvm.java

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hdqcinema.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {
    private lateinit var biding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        biding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.startButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}