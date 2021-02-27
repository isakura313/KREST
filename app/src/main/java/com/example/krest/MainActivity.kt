package com.example.krest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(
                findViewById<Button>(R.id.button),
                findViewById<Button>(R.id.button2),
                findViewById<Button>(R.id.button3),
                findViewById<Button>(R.id.button4),
                findViewById<Button>(R.id.button5),
                findViewById<Button>(R.id.button6),
                findViewById<Button>(R.id.button7),
                findViewById<Button>(R.id.button8),
                findViewById<Button>(R.id.button9)
        )


        var symbol = "0"
        var color = "#673AB7"
        fun getSymbol(): String {
            when (symbol) {
                "0" -> {
                    symbol = "X"
                    color= "#E91E63"

                }
                "X" -> {
                    symbol = "0"
                    color= "#673AB7"
                }
            }
            return symbol
        }

//        val btn = findViewById<Button>(R.id.button)

        buttons[0].setOnClickListener {
            buttons[0].text = getSymbol()
            buttons[0].setBackgroundColor(Color.BLUE);
        }
        buttons[1].setOnClickListener {
            buttons[1].text = getSymbol()
        }
        buttons[2].setOnClickListener {
            buttons[2].text = getSymbol()
        }
        buttons[3].setOnClickListener {
            buttons[3].text = getSymbol()
        }
        buttons[4].setOnClickListener {
            buttons[4].text = getSymbol()
        }
        buttons[5].setOnClickListener {
            buttons[5].text = getSymbol()
        }
        buttons[6].setOnClickListener {
            buttons[6].text = getSymbol()
        }
        buttons[7].setOnClickListener {
            buttons[7].text = getSymbol()
        }
        buttons[8].setOnClickListener {
            buttons[8].text = getSymbol()
        }


//        val clickListener =  View.OnClickListener{view->
//            (view as Button).text = getSymbol()
//            when(view.getId()){
//                R.id.button -> {
//                    buttons[0].text = "adas"
//                }
//
//                R.id.button2 -> {
//
//                }
//                R.id.button3 -> {
//
//                }
//            }
//        }
    }
}