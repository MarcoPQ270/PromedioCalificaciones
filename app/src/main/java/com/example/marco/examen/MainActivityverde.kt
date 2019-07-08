package com.example.marco.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activityrojo.*

class MainActivityverde : AppCompatActivity() {

    companion object ResCompanion {


        val EXTRA_B = "extraB"
        private val DEFAULT_B: Double = -1.0


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityverde)

        var nom: String
        val intent = intent
        nom = intent.getStringExtra("nombre")
        tvnombre.setText(nom)

        if (intent != null && intent.hasExtra(MainActivityverde.EXTRA_B)) {

            val resB: Double = intent.getDoubleExtra(MainActivityverde.EXTRA_B, MainActivityverde.DEFAULT_B)

            tvrprom.setText("Promedio: " + resB.toString())

        }
    }
}
