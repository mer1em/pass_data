package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var contbut : TextView
    lateinit var nameedittext : EditText
    lateinit var surnameedittext : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        contbut = findViewById(R.id.contbut)
        nameedittext = findViewById(R.id.nameedittext)
        surnameedittext = findViewById(R.id.surnameedittext)

        contbut.setOnClickListener {

            val name = nameedittext.text.toString()
            val surname = surnameedittext.text.toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("SURNAME", surname)
            startActivity(intent)
        }
    }
}