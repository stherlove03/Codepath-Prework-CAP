package com.example.helloworld1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
//import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Esther", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.yellow))

        }
        findViewById<Button>(R.id.button3).setOnClickListener{

            Log.i("Esther", "Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.red))

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backgroundView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}