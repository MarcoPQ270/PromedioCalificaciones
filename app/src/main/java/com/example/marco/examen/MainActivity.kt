package com.example.marco.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nombre: String = ""
    var cal1: Double = 0.0
    var cal2: Double = 0.0
    var cal3: Double = 0.0
    var cal4: Double = 0.0

    var promedio: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(v: View) {
        if (editText.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            editText.requestFocus()
        } else if (etnombre.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            etnombre.requestFocus()

        } else if (etcal1.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            etcal1.requestFocus()

        } else if (etcal2.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            etcal2.requestFocus()

        } else if (etcal3.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            etcal3.requestFocus()

        } else if (etcal4.text.isEmpty()) {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            etcal4.requestFocus()

        } else {
            nombre=etnombre.text.toString()

            cal1 = etcal1.text.toString().toDouble()
            cal2 = etcal2.text.toString().toDouble()
            cal3 = etcal3.text.toString().toDouble()
            cal4 = etcal4.text.toString().toDouble()
            promedio = (cal1 + cal2 + cal3 + cal4) / 4

            if (promedio < 70) {

                val intent = Intent(this, MainActivityrojo::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra(MainActivityrojo.EXTRA_B, promedio)
                startActivity(intent)
            }else if(promedio>=70){
                val intent = Intent(this, MainActivityverde::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra(MainActivityverde.EXTRA_B, promedio)
                startActivity(intent)

            }

        }
    }
}