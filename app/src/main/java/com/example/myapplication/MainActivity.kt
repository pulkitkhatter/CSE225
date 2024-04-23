package com.example.myapplication

import android.graphics.Color
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circleView = findViewById<CircleView>(R.id.circle_view)
        val squareView = findViewById<SquareView>(R.id.square_view)

        circleView.setOnClickListener {
            val newRadius = (100..300).random().toFloat()
            circleView.setRadius(newRadius)

            val randomColor = getRandomColor()
            circleView.setColor(randomColor)
        }

        squareView.setOnClickListener {
            val newLength = (100..300).random().toFloat()
            squareView.setSideLength(newLength)
            val randomColor = getRandomColor()
            squareView.setColor(randomColor)
        }
    }

    private fun getRandomColor(): Int {
        val randomRed = (0..255).random()
        val randomGreen = (0..255).random()
        val randomBlue = (0..255).random()
        return Color.rgb(randomRed, randomGreen, randomBlue)
    }
}
