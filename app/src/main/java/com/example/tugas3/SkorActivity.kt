package com.example.tugas3

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SkorActivity : AppCompatActivity() {

    var skorA = 0
    var skorB = 0
    var nilai: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skor)

        val namatimA = findViewById<TextView>(R.id.tv_Tim_A)
        val namatimB = findViewById<TextView>(R.id.tv_Tim_B)

        val namaA = intent.getStringExtra("Tim A")
        val namaB = intent.getStringExtra("Tim B")

        namatimA.text = "Team $namaA"
        namatimB.text = "Team $namaB"
    }

    fun Tambah(view: View) {
        if (view.id == R.id.btn_poin1A) {
            skorA = skorA + 1
        } else if (view.id == R.id.btn_poin2A) {
            skorA = skorA + 2
        } else if (view.id == R.id.btn_poin3A) {
            skorA = skorA + 3
        } else if (view.id == R.id.btn_poin1B) {
            skorB = skorB + 1
        } else if (view.id == R.id.btn_poin2B) {
            skorB = skorB + 2
        } else if (view.id == R.id.btn_poin3B) {
            skorB = skorB + 3
        }
        val skortimA = findViewById<TextView>(R.id.tv_Skor_Tim_A)
        val skortimB = findViewById<TextView>(R.id.tv_Skor_Tim_B)
        skortimA.text = skorA.toString()
        skortimB.text = skorB.toString()
    }

    fun Reset(view: View) {
        if (view.id == R.id.btn_resetA) {
            skorA = 0
        } else if (view.id == R.id.btn_resetB) {
            skorB = 0
        }
        val skortimA = findViewById<TextView>(R.id.tv_Skor_Tim_A)
        val skortimB = findViewById<TextView>(R.id.tv_Skor_Tim_B)
        skortimA.text = skorA.toString()
        skortimB.text = skorB.toString()
    }
}