package com.example.implementfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragmentOne())
            commit()
        }

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragmentOne())
                addToBackStack(null)
                commit()
            }
        }

        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragmentTwo())
                addToBackStack(null)
                commit()
            }
        }
    }
}