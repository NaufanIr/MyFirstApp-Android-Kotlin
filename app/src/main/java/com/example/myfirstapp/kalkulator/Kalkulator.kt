package com.example.myfirstapp.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myfirstapp.R

class Kalkulator : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnHitung1: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        edtPanjang = findViewById(R.id.edtPanjang)
        edtLebar = findViewById(R.id.edtLebar)
        btnHitung = findViewById(R.id.btnHitung)
        btnHitung1 = findViewById(R.id.btnHitung1)
        tvHasil = findViewById(R.id.tvHasil)

        btnHitung.setOnClickListener(this)
        btnHitung1.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when(v.id){
            R.id.btnHitung ->{
                val panjang = edtPanjang.text.toString().trim()
                val lebar = edtLebar.text.toString().trim()

                var isEmpty = false

                if (panjang.isEmpty()){
                    isEmpty = true
                    edtPanjang.error = "Data tidak boleh kosong!"
                }
                if (lebar.isEmpty()){
                    isEmpty = true
                    edtLebar.error = "Data tidak boleh kosong!"
                }

                if (isEmpty){
                    tvHasil.text = "Error"
                }else{
                    val luas = "Hasil: ${panjang.toDouble() * lebar.toDouble()}"
                    tvHasil.text = luas
                }
            }

            R.id.btnHitung1 ->{
                val p = edtPanjang.text.toString().trim()
                val l = edtLebar.text.toString().trim()

                val intenHasil1 = Intent(this, Hasil1::class.java)
                intenHasil1.putExtra(Hasil1.PANJANG, p.toDouble())
                intenHasil1.putExtra(Hasil1.LEBAR, l.toDouble())
                startActivity(intenHasil1)
            }
        }
    }
}