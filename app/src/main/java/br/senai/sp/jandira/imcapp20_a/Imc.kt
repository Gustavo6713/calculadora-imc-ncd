package br.senai.sp.jandira.imcapp20_a

import android.util.Log

fun calcularImc(peso: Double, altura: Double) = peso / (altura * altura)

fun obterStatus(imc: Double) : List<String> {

    var resultados = emptyList<String>()
    if (imc < 18.5) {
        resultados = listOf("Abaixo do Peso", "Risco de fadiga, stress e ansiedade.")
    } else if (imc > 18.5 && imc <= 25) {
        resultados = listOf("Peso ideal", "Menor risco de doenças e vasculares.")
    } else if (imc > 25 && imc <= 30) {
        resultados = listOf("Acima do peso", "Risco de má circulação, fadiga e varizes.")
    } else if (imc > 30 && imc <= 35) {
        resultados = listOf("Obesidade Grau I", "Risco de diabetes, angina, infarto e aterosclerose.")
    } else if (imc > 35 && imc <= 40) {
        resultados = listOf("Obesidade Grau II", "Risco de apenia do sono e falta de ar.")
    } else {
        resultados = listOf("Risco de refluxo, dificuldade para se mover, escaras, diabetes, infarto e AVC.")
    }
    return resultados
}