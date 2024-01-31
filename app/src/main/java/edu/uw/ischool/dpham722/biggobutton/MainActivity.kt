package edu.uw.ischool.dpham722.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.graphics.Color
import android.widget.Button
import kotlin.random.Random
import android.content.res.ColorStateList


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.gobutton)

        button.setOnClickListener {
            counter++

            if (counter == 1) {
                val buttonTest =getString(R.string.pushed_once)
                button.text = buttonTest
            } else {
                val buttonTest = getString(R.string.pushed_multiple, counter)
                button.text = buttonTest
            }
            button.backgroundTintList = ColorStateList.valueOf(randomColor())
            button.setTextColor(randomColor())
        }
    }

    private fun randomColor(): Int {
        val random = Random
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }
}