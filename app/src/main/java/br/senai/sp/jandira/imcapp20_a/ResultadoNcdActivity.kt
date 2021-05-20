package br.senai.sp.jandira.imcapp20_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val textViewNcd : TextView = findViewById(R.id.text_view_resultado_ncd)
        val textDicaNcd: TextView = findViewById(R.id.text_view_dica_ncd)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val nivelAtividade = intent.getIntExtra("nivelAtividade", 0)
        val faixaEtaria = intent.getIntExtra("faixaEtaria", 0)
        val genero = intent.getCharExtra("genero", 'f')

        val ncd = calcularNcd(peso, faixaEtaria, genero, nivelAtividade)

        textViewNcd.text = String.format("%.2f", ncd)

        textDicaNcd.text = getDicaDoDiaNcd()

    }
}