package com.example.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SquareView : View {

    private var sideLength = 200f
    private var squareColor = Color.RED
    private val paint = Paint()

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        paint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val left = (width - sideLength) / 2f
        val top = (height - sideLength) / 2f
        val right = left + sideLength
        val bottom = top + sideLength
        paint.color = squareColor
        canvas.drawRect(left, top, right, bottom, paint)
    }

    fun setSideLength(newLength: Float) {
        sideLength = newLength
        invalidate()
    }

    fun setColor(newColor: Int) {
        squareColor = newColor
        invalidate()
    }
}
