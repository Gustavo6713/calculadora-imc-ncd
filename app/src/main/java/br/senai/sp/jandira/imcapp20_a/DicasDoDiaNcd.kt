package br.senai.sp.jandira.imcapp20_a

import java.util.*

fun getDicaDoDiaNcd() : String {

    val dicas = listOf<String>(
        "Procure manter a dieta de segunda à sexta-feira, mas cuidado com os excessos de final de semana. Comer de “tudo”, mas cuidar com as quantidades.",
        "Quando tiver vontade de beliscar: Primeiro beba 1 copo de água, depois escolha: Gelatina diet/light ou capuccino diet ou chá ou frutas secas, água de coco ou refrigerante diet/light ou refresco diet/light.",
        "Alimentos que podem apresentar consumo livre: Chá ou café (com adoçante), água de coco, refrigerante diet/light, limonada (com adoçante), gelatina diet/light, suco de melão ou melancia (sem açúcar) e hortaliças.",
        "Quando sair para comer fora: Escolher pratos que acompanhem legumes e usar bebida alcoólica com moderação (intercalada com 1 copo de água).",
        "No inverno, é possível substituir saladas cruas por uma excelente salada quente. Refogue verduras ou cozinhe no vapor, mas não por muito tempo, para não perder os nutrientes.",
        "Temperos que emagrecem: Pimenta vermelha (3g/dia), gengibre (1 colher de chá/ dia) e vinagre de maçã (2 colheres de chá/dia) são alimentos termogênicos, capazes de acelerar o metabolismo.",
        "Diuréticos naturais: Quem tem a tendência de reter líquidos, pode amenizar o problema incluindo salsa na dieta. Ela atua no organismo como um diurético natural, ajudando os vasos sanguíneos a eliminar o excesso de líquidos. Pode ser adicionada em sanduíches, sopas e chás."
    )

    val sorteio = Random()
    val dica = sorteio.nextInt(dicas.size)

    return  dicas[dica]
}