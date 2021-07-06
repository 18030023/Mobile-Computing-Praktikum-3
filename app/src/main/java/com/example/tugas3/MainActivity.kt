package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun Input(view: View?) {
        val inputnamatimA = findViewById<EditText>(R.id.edt_Tim_A)
        val inputnamatimB = findViewById<EditText>(R.id.edt_Tim_B)
        val namatimA = inputnamatimA.text.toString()
        Log.d(TAG, namatimA)
        val namatimB = inputnamatimB.text.toString()
        Log.d(TAG, namatimB)
        val intent = Intent(this@MainActivity, SkorActivity::class.java)
        intent.putExtra("Tim A", namatimA)
        intent.putExtra("Tim B", namatimB)
        startActivity(intent)
    }
}