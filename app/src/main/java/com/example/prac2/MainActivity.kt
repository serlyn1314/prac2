package com.example.prac2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.buttonDone)
        val tvNickName :TextView = findViewById(R.id.tvNickName)
        val tfNickName :TextView = findViewById(R.id.tfNickName)

        btn.setOnClickListener(){
            tvNickName.text = tfNickName.text
            tvNickName.visibility = View.VISIBLE

            tfNickName.visibility = View.GONE
            btn.visibility = View.GONE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }

        tvNickName.setOnClickListener(){
            tvNickName.visibility = View.GONE

            tfNickName.visibility = View.VISIBLE
            btn.visibility = View.VISIBLE

            tfNickName.requestFocus()
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(tfNickName, 0)

        }
    }
}