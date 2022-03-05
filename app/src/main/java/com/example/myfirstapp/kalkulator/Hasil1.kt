package com.example.myfirstapp.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myfirstapp.R

class Hasil1 : AppCompatActivity() {

    companion object{
        const val PANJANG = ""
        const val LEBAR = ""
        const val LUAS = ""
    }

    private lateinit var tvPanjang: TextView
    private lateinit var tvLebar: TextView
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil1)

        tvPanjang = findViewById(R.id.tvPanjang)
        tvLebar = findViewById(R.id.tvLebar)
        tvHasil = findViewById(R.id.tvHasil1)


        val p = intent.getDoubleExtra(PANJANG, 0.0)
        tvPanjang.text = "Panjang: $p"

        val l = intent.getDoubleExtra(LEBAR, 0.0)
        tvLebar.text = "Lebar: $l"

//        val ans = intent.getDoubleExtra(LUAS, 0.0)
        val luas = "Luas Persegi Panjang: ${p * l}"
        tvHasil.text = luas
    }
}