package br.senai.sp.jandira.imcapp20_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val buttonCalcularNcd: Button = findViewById(R.id.button_calcular_ncd)
        val editTextPesoNcd: EditText = findViewById(R.id.ed_peso_ncd)
        val generoFemenino : RadioButton = findViewById(R.id.genero_femenino)
        val generoMasculino : RadioButton = findViewById(R.id.genero_masculino)
        val spinnerIdade: Spinner = findViewById(R.id.spinner_faixa_etaria)
        val spinnerAtividade: Spinner = findViewById(R.id.spinner_atividade)


        buttonCalcularNcd.setOnClickListener {
            //Validação
            if (editTextPesoNcd.text.isEmpty()) {
                editTextPesoNcd.error = "Campo obrigatório!"
            }

            if (editTextPesoNcd.text.isNotEmpty()) {
                val peso: Double = editTextPesoNcd.text.toString().toDouble()
                val nivelAtividade = spinnerAtividade.selectedItemPosition
                val faixaEtaria = spinnerIdade.selectedItemPosition
                val intent = Intent(this, ResultadoNcdActivity::class.java)

                if (generoMasculino.isChecked()) {
                    val genero = 'm'
                    intent.putExtra("genero", genero)
                } else {
                    val genero = 'f'
                    intent.putExtra("genero", genero)
                }
                intent.putExtra("peso", peso)
                intent.putExtra("nivelAtividade", nivelAtividade)
                intent.putExtra("faixaEtaria", faixaEtaria)
                startActivity(intent)
            }
        }
    }
}