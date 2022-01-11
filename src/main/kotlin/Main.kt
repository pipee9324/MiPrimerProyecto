import modelos.BancoPreguntas
import modelos.Pregunta

var PUNTAJE = 0

fun main() {
    // Declarar el mensaje de entrada del programa
    println("Hola, Vamos a jugar quien quiere ser millonario ¿Empezamos?, Mi nombre es Felipe Cubillos, Te realizare 25 preguntas en el cual tenemos 5 categorias que van desde, muy facil, facil, medio, dificil y muy dificil ")
    println("1. Vamos ha empezar?")
    println("2. Que respuestas puedo dar")
    println("3. Salir")

    // Obtener el valor del usuario y convertirlo a un entero nullable
    val valorIngresado = readLine()

    // Dependiendo del numero utilizamos el when para realizar una acción.
    when (valorIngresado) {
        "1" -> empezarJuego()
        "3" -> salir()
        else -> mostrarError()
    }

}

//Mostramos un error por pantalla
fun mostrarError() {
    println("abandonaste de manera intencional tu acumulacion de dinero quedan reducidos a 0")
}

//Mostramos un mensaje de despedida por pantalla con puntuacion de moneda
fun salir() {
    println("Gracias por participar en quien quiere ser millonario tu dinero corresponde al siguiente, xxxxx ")
}


// Preguntamos al usuario que deberiamos mostrarle y le mostramos un respuesta correcta
fun empezarJuego() {
    var bancoPreguntas = BancoPreguntas()
    var todasLasPreguntas = bancoPreguntas.obtenerPreguntas()
    var categoriaUno = todasLasPreguntas.filter { it.categoria == 1 }
    var categoriaDos = todasLasPreguntas.filter { it.categoria == 2 }
    var categoriaTres = todasLasPreguntas.filter { it.categoria == 3 }
    var categoriaCuatro = todasLasPreguntas.filter { it.categoria == 4 }
    var categoriaCinco = todasLasPreguntas.filter { it.categoria == 5 }

    preguntar(categoriaUno[rand(0, 4)])
    preguntar(categoriaDos[rand(0, 4)])
    preguntar(categoriaTres[rand(0, 4)])
    preguntar(categoriaCuatro[rand(0, 4)])
    preguntar(categoriaCinco[rand(0, 4)])

    println("Ganaste!!")

}

fun preguntar(pregunta: Pregunta) {
    println(pregunta.enunciado)
    pregunta.listadoRespuestas.forEachIndexed { indexRespuesta, respuesta ->
        val numeroPregunta = indexRespuesta + 1
        println("$numeroPregunta. $respuesta")
    }

    val respuestaIngresada = readLine()?.toInt()
    if (respuestaIngresada == pregunta.respuesta) {
        if (pregunta.categoria == 5) {
            println("-------------")
            println("JUEGO FINALIZADO, RESPONDISTE TODO CORRECTAMENTE!!!")
            println("TU PUNTAJE FINAL ES $PUNTAJE!")
            println("-------------")
        } else {
            println("Correcta, continua con la pregunta de la siguiente categoria")
            PUNTAJE += 10
            println(" ")
            val siguienteCaregoria = pregunta.categoria?.plus(1)
            println("Sigue la categoria numero $siguienteCaregoria")
            println(" ")
        }
    } else {
        println("Errada")
        println(" ")
        println("Tu puntaje total fue: $PUNTAJE")
        throw Exception("Juego Finalizado")
    }
    println("Tu puntaje es: $PUNTAJE")
    println(" ")

}

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}
