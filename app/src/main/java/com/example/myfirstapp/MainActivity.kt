package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myfirstapp.artikel.Artikel
import com.example.myfirstapp.kalkulator.Kalkulator
import com.example.myfirstapp.listPahlawan.ListPahlawan
import com.example.myfirstapp.listPahlawan.data.Hero

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnKalkulator: Button
    private lateinit var btnArtikel: Button
    private lateinit var btnListPahlawan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKalkulator = findViewById(R.id.btnKalkulator)
        btnArtikel = findViewById(R.id.btnArtikel)
        btnListPahlawan = findViewById(R.id.btnListPahlawan)

        btnKalkulator.setOnClickListener(this)
        btnArtikel.setOnClickListener(this)
        btnListPahlawan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnKalkulator -> {
                val iKalkulator = Intent(this, Kalkulator::class.java)
                startActivity(iKalkulator)
            }
            R.id.btnArtikel -> {
                val iArtikel = Intent(this, Artikel::class.java)
                startActivity(iArtikel)
            }
            R.id.btnListPahlawan -> {
                val iListPahlawan = Intent(this, ListPahlawan::class.java)
                startActivity(iListPahlawan)
            }
        }
    }

}