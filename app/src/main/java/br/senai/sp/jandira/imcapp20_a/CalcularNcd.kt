package br.senai.sp.jandira.imcapp20_a

fun calcularNcd(peso: Double, faixaEtaria: Int, genero: Char, nivelAtividade: Int) : Double {

    //Homem:
    if (genero == 'm') {
        //Nenhuma Atividade
        if (nivelAtividade == 0) {
            if (faixaEtaria == 0) {
                return 15.3 * peso + 679
            } else if (faixaEtaria == 1) {
                return 11.6 * peso + 879
            } else {
                return 13.5 * peso + 487
            }
         //Atividade Leve
        } else if (nivelAtividade == 1) {
            if (faixaEtaria == 0) {
                return (15.3 * peso + 679) * 1.5
            } else if (faixaEtaria == 1) {
                return (11.6 * peso + 879) * 1.5
            } else {
                return (13.5 * peso + 487) * 1.5
            }
         // Atividade Moderada
        } else if (nivelAtividade == 2) {
            if (faixaEtaria == 0) {
                return (15.3 * peso + 679) * 1.8
            } else if (faixaEtaria == 1) {
                return (11.6 * peso + 879) * 1.8
            } else {
                return (13.5 * peso + 487) * 1.8
            }
         // Atividade Intensa
        } else if (nivelAtividade == 3) {
            if (faixaEtaria == 0) {
                return (15.3 * peso + 679) * 2.1
            } else if (faixaEtaria == 1) {
                return (11.6 * peso + 879) * 2.1
            } else {
                return (13.5 * peso + 487) * 2.1
            }
        }
    //Mulher:
    } else {
        //Nenhuma Atividade
        if (nivelAtividade == 0) {
            if (faixaEtaria == 0) {
                return 14.7 * peso + 496
            } else if (faixaEtaria == 1) {
                return 8.7 * peso + 829
            } else {
                return 10.5 * peso + 596
            }
        //Atividade Leve
        } else if (nivelAtividade == 1) {
            if (faixaEtaria == 0) {
                return (14.7 * peso + 496) * 1.6
            } else if (faixaEtaria == 1) {
                return (8.7 * peso + 829) * 1.6
            } else {
                return (10.5 * peso + 596) * 1.6
            }
        //Atividade Moderada
        } else if (nivelAtividade == 2) {
            if (faixaEtaria == 0) {
                return (14.7 * peso + 496) * 1.6
            } else if (faixaEtaria == 1) {
                return (8.7 * peso + 829) * 1.6
            } else {
                return (10.5 * peso + 596) * 1.6
            }
        //Atividade Intensa
        } else if (nivelAtividade == 3) {
            if (faixaEtaria == 0) {
                return (14.7 * peso + 496) * 1.8
            } else if (faixaEtaria == 1) {
                return (8.7 * peso + 829) * 1.8
            } else {
                return (10.5 * peso + 596) * 1.8
            }
        }
    }
    return 0.0
}