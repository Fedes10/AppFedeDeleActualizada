package com.example.delefede.ui.dele

data class Cancion(
    val id: Int,
    val titulo: String,
    val categoria: String,
    val letra: String,
    val audioPath: String? = null
)
