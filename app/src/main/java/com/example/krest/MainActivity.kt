package com.example.krest

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
        fun getSymbol():String{
            when(symbol){
                "0" -> {
                    symbol = "X"
                }
                "X" -> {
                    symbol = "0˝"
                }
            }
            return symbol
        }

        val clickListener =  View.OnClickListener{view->
            (view as Button).text = getSymbol()
            when(view.getId()){
                R.id.button -> {

                }

                R.id.button2 -> {

                }
                R.id.button3 -> {

                }
            }
        }
    }
}