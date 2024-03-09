package com.example.tpcalculcyber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var btn: Button
    lateinit var result: TextView
    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.et_n1)
        n2 = findViewById(R.id.et_n2)
        btn = findViewById(R.id.btn_somme)
        result = findViewById(R.id.tv_result)
        next = findViewById(R.id.btn_next)
        somme()
        next.setOnClickListener {
            next()
        }


    }

    fun somme() {
        btn.setOnClickListener {
            if (n1.text.toString().isNullOrEmpty() || n2.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "values missing", Toast.LENGTH_SHORT).show()
            } else {
                val intN1 = n1.text.toString().toInt()
                val intN2 = n2.text.toString().toInt()
                result.text = (intN1 + intN2).toString()
            }
        }
    }


    fun next() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}