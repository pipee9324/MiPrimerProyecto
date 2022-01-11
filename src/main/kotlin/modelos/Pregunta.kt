package modelos

data class Pregunta(
    var respuesta: Int? = null,
    var enunciado: String? = null,
    var listadoRespuestas: ArrayList<String> = arrayListOf(),
    var categoria: Int? = null,
)