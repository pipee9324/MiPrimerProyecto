package modelos

class BancoPreguntas {


    fun obtenerPreguntas(): List<Pregunta> {
        //primer categoria
        var preguntaUno = Pregunta(
            3,
            "Cuáles son las partes del cuerpo humano?",
            arrayListOf("Cabeza y manos", "Pies y boca", "Tronco, extremidades y cabeza ", "Ojos y cabello"), 1
        )
        var preguntaDos = Pregunta(
            4,
            "Cómo se llama un polígono de 3 lados?",
            arrayListOf("Cuadrado", "Rectagulo", "Circulo", "Triángulo"), 1
        )
        var preguntaTres =
            Pregunta(
                4,
                "Cuántos minutos tiene una hora?",
                arrayListOf("Cuarenta", "Cincuenta", "Ochenta", "Sesenta"),
                1
            )
        var preguntaCuatro = Pregunta(
            1,
            "Cómo se dice en ingles \"buenas tardes\"? ",
            arrayListOf("Good afternoon.", "bye", "how are you?", "Hello"), 1
        )
        var preguntaCinco = Pregunta(
            1,
            "Cuál es el resultado de 9x9",
            arrayListOf("Ochenta y uno", "Noventa", "Noventa y nueve ", "Noventa y cuatro "), 1
        )

        //segunda categoria
        var preguntaSeis = Pregunta(
            4,
            "Es lo mismo multiplicar 3x4 que 4x3? Sí, el resultado es el mismo ",
            arrayListOf("Diez  ", "Quince ", "Veinte", "Doce "), 2
        )
        var preguntaSiete = Pregunta(
            3,
            "¿Qué expulsan las plantas por la noche?  ",
            arrayListOf("Helio ", "Nitrógeno", "Dióxido de carbono", "Ninguna de las anteriores"), 2
        )
        var preguntaOcho = Pregunta(
            3,
            "Cómo se llaman los animales que solo se alimentan de vegetales y plantas? ",
            arrayListOf("Omnivoro ", "Carniboros ", "Herbívoros", "ninguna de las anteriores"), 2
        )
        var preguntaNueve = Pregunta(4, "Cuál es el antónimo de rico? ", arrayListOf("Malo ", "Bravo ", "Feo", "Pobre"))
        var preguntaDiez = Pregunta(
            4,
            "Cuantas horas tiene un dia?  ",
            arrayListOf("Veinte ", "Veintidós ", "Diecinueve ", "Veinticuatro "), 2
        )

        //tercera categoria
        var preguntaOnce =
            Pregunta(2, "Capital de colombia? ", arrayListOf("Medellin ", "Bogota ", "Cali ", "Barranquilla "))
        var preguntaDoce = Pregunta(
            2,
            "Los números son estudiados por?  ",
            arrayListOf("La biología ", "Las Matemáticas", "La sociología", "Ninguna de las anteriores"), 3
        )
        var preguntaTrece = Pregunta(
            1,
            "Qué aparato es un medio de comunicación? ",
            arrayListOf("El teléfono ", "Una grabadora ", "Un reloj ", "ninguna de las anteriores"), 3
        )
        var preguntaCatorce = Pregunta(
            3,
            "Qué utensilios son para comer? ",
            arrayListOf("Una mesa ", "La escoba ", "Una cuchara", "Una computadora"), 3
        )
        var preguntaQuince = Pregunta(
            3,
            "Qué ciencia o disciplina estudia la estructura y funcionamiento del cuerpo humano?  ",
            arrayListOf("Cardiología ", "Zoología ", "Anatomía ", "Fisiología humana "), 3
        )

        //cuarta categoria
        var preguntaDieciseis =
            Pregunta(
                3,
                "Cuantos planetas hay en el sistema solar? ",
                arrayListOf("Diez  ", "Quince ", "Ocho", "Doce "),
                4
            )
        var preguntaDiecisiete = Pregunta(
            4,
            "África, América, Antártida, Asia, Europa, y Oceanía son?  ",
            arrayListOf("Países ", "Municipios", "Estados/provincias", "Continentes"), 4
        )
        var preguntaDieciocho = Pregunta(
            1,
            "En qué se especializa la cartografía? ",
            arrayListOf("Estudia los mapas ", "Estudia la ciencia  ", "Estudia la medicina ", "Estudia la moda"), 4
        )
        var preguntaDiecinueve = Pregunta(
            1,
            "Qué cantidad de huesos en el cuerpo humano adulto? ",
            arrayListOf("Doscientos seis  ", "Doscientos dos  ", "Trescientos ", "Ninguna de las anteriores"), 4
        )
        var preguntaVeinte = Pregunta(
            1,
            "Si 50 es el 100%, ¿cuánto es el 90%?  ",
            arrayListOf("Cuarenta y cinco  ", "Cuarenta  ", "Cuarenta y dos  ", "Treinta "), 4
        )

        //cinco categoria
        var preguntaVeintiun = Pregunta(
            1,
            "Cuándo acabó la II Guerra Mundial? ",
            arrayListOf(
                "Mil novecientos cuarenta y cinco   ",
                "Mil novecientos cincuenta ",
                "Mil novecientos cincuenta y tres ",
                "Mil novecientos cuarenta y tres  "
            ), 5
        )
        var preguntaVeintidos = Pregunta(
            1,
            "Qué año llegó Cristóbal Colón a América?  ",
            arrayListOf(
                "Mil cuatrocientos noventa y dos  ",
                "Mil cuatrocientos noventa y tres",
                "Mil cuatrocientos ochenta y nueve ",
                "Mil cuatrocientos noventa "
            ), 5
        )
        var preguntaVeintitres = Pregunta(
            2,
            "Cuál fue el primer metal que empleó el hombre? ",
            arrayListOf("Oro ", "Cobre ", "Bronce", "PLata"), 5
        )
        var preguntaVeinticuatro =
            Pregunta(
                1,
                "Quién ganó el mundial de 2014? ",
                arrayListOf("Brasil ", "Alemania ", "Francia ", "Italia "),
                5
            )
        var preguntaVeinticinco = Pregunta(
            3,
            "En qué año viajó al espacio el primer ser humano?  ",
            arrayListOf(
                "Mil novecientos sesenta y tres ",
                "Mil novecientos sesenta y dos  ",
                "Mil novecientos sesenta y uno  ",
                "Mil novecientos sesenta y cuatro "
            ), 5
        )


        return listOf(
            preguntaUno,
            preguntaDos,
            preguntaTres,
            preguntaCuatro,
            preguntaCinco,
            preguntaSeis,
            preguntaSiete,
            preguntaOcho,
            preguntaNueve,
            preguntaDiez,
            preguntaOnce,
            preguntaDoce,
            preguntaTrece,
            preguntaCatorce,
            preguntaQuince,
            preguntaDieciseis,
            preguntaDiecisiete,
            preguntaDieciocho,
            preguntaDiecinueve,
            preguntaVeinte,
            preguntaVeintiun,
            preguntaVeintidos,
            preguntaVeintitres,
            preguntaVeinticuatro,
            preguntaVeinticinco
        )
    }
}

