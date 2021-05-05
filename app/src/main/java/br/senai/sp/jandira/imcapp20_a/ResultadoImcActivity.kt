package br.senai.sp.jandira.imcapp20_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        val textViewImc: TextView = findViewById(R.id.text_view_resultado)
        val textViewStatus: TextView = findViewById(R.id.text_view_status)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val altura = intent.getDoubleExtra("altura", 0.0)

        val imc = calcularImc(peso, altura)

        textViewImc.text = String.format("%.1f", imc)
        textViewStatus.text = obterStatus(imc)

    }
}