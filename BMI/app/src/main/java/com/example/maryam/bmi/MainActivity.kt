package com.example.maryam.bmi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 = findViewById<EditText>(R.id.editText4) as EditText;
        val n2= findViewById<EditText>(R.id.editText5)  as EditText;

        val btn= findViewById<Button>(R.id.button)  as Button;
        val t1 = findViewById<TextView>(R.id.tv) as TextView
        btn.setOnClickListener {

            val a: String = n1.text.toString()
            val b: String = n2.text.toString()

            if (n1.text.isEmpty() && n2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show();
            } else {

                val a1: Float = n1.text.toString().toFloat() / n2.text.toString().toFloat();
                val a2: Float= a1 / n2.text.toString().toFloat();

                //Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show();
                t1.text=a2.toString();
            }

        }
    }
}
