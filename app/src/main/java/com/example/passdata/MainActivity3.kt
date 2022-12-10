package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    lateinit var nametextview : TextView
    lateinit var surnametextview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        nametextview = findViewById(R.id.nametextview)
        surnametextview = findViewById(R.id.surnametextview)

        val myname = intent.getStringExtra("NAME")
        val mysurname = intent.getStringExtra("SURNAME")

        nametextview.text = myname
        surnametextview.text = mysurname


    }
}