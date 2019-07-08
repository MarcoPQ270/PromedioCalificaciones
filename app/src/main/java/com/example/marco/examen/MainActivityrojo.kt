package com.example.marco.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activityrojo.*

class MainActivityrojo : AppCompatActivity() {

    companion object ResCompanion {


        val EXTRA_B = "extraB"
        private val DEFAULT_B: Double = -1.0


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityrojo)

        var nom: String
        val intent = intent
        nom = intent.getStringExtra("nombre")
        tvnombre.setText(nom)

        if (intent != null && intent.hasExtra(MainActivityrojo.EXTRA_B)) {

            val resB: Double = intent.getDoubleExtra(MainActivityrojo.EXTRA_B, MainActivityrojo.DEFAULT_B)

            tvrprom.setText("Promedio: " + resB.toString())

        }


    }
}