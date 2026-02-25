package com.example.delefede.ui.dele

import androidx.lifecycle.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DeleViewModel : ViewModel() {
    private val _canciones = MutableLiveData<List<Cancion>>(CancioneroRepository.canciones)
    val canciones: LiveData<List<Cancion>> = _canciones

    private val _cancionSeleccionada = MutableLiveData<Cancion?>()
    val cancionSeleccionada: LiveData<Cancion?> = _cancionSeleccionada

    fun buscarCanciones(query: String) {
        _canciones.value = CancioneroRepository.buscarCanciones(query)
    }

    fun filtrarPorCategoria(categoria: String) {
        _canciones.value = CancioneroRepository.cancionesPorCategoria(categoria)
    }

    fun seleccionarCancion(cancion: Cancion) {
        _cancionSeleccionada.value = cancion
    }
}
