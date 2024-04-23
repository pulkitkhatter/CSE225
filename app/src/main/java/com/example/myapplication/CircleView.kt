package com.example.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView : View {

    private var radius = 100f
    private var circleColor = Color.BLUE
    private val paint = Paint()

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val centerX = width / 2f
        val centerY = height / 2f
        paint.color = circleColor
        canvas.drawCircle(centerX, centerY, radius, paint)
    }

    fun setRadius(newRadius: Float) {
        radius = newRadius
        invalidate()
    }

    fun setColor(newColor: Int) {
        circleColor = newColor
        invalidate()
    }
}
