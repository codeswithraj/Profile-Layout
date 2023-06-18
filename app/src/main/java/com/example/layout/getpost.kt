package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class getpost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getpost)
        val textView=findViewById<TextView>(R.id.textView)
        val editText=findViewById<EditText>(R.id.editText)
        val btn=findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val text=editText.text.toString()
            textView.setText(text)
            editText.text.clear()
        }


        val textView1=findViewById<TextView>(R.id.textView1)
        val editText1=findViewById<EditText>(R.id.editText1)
        val btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val text=editText1.text.toString()
            textView1.setText(text)
            editText1.text.clear()
        }



    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Method", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Method", Toast.LENGTH_SHORT).show()
    }
}