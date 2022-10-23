package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var List = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    lateinit var  selecteMenu: TextView
    lateinit var newMenu: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selecteMenu = findViewById(R.id.select_value)
        newMenu = findViewById(R.id.add_menu)

    }

    fun decideMenu(v: View) {
        val randIdx = Random.nextInt(List.size)
        selecteMenu.text = List[randIdx]
    }

    fun addMenu(v: View) {
        val newMenuValue = newMenu.text.toString().trim()
        if (newMenuValue.isNotEmpty()) {
            selecteMenu.text = newMenuValue
            List.add(newMenuValue)
        }
    }
}