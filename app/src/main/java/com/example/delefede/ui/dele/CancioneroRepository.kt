package com.example.delefede.ui.dele

object CancioneroRepository {
    // Simulación de canciones locales
    val canciones = listOf(
        Cancion(
            id = 1,
            titulo = "Alabaré",
            categoria = "Alabanza",
            letra = "Alabaré, alabaré, alabaré a mi Señor...",
            audioPath = "canciones/alabare.mp3"
        ),
        Cancion(
            id = 2,
            titulo = "Cerca de ti, Señor",
            categoria = "Oración",
            letra = "Cerca de ti, Señor, quiero estar...",
            audioPath = "canciones/cercadetisenor.mp3"
        )
        // Añadir más canciones aquí
    )

    fun buscarCanciones(query: String): List<Cancion> {
        return canciones.filter {
            it.titulo.contains(query, ignoreCase = true) ||
            it.letra.contains(query, ignoreCase = true)
        }
    }

    fun cancionesPorCategoria(categoria: String): List<Cancion> {
        return canciones.filter { it.categoria == categoria }
    }
}
