package com.example.delefede.ui.dele

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.delefede.R


import android.widget.EditText
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import androidx.navigation.fragment.findNavController

class DeleFragment : Fragment() {
    private val viewModel: DeleViewModel by viewModels()
    private lateinit var adapter: CancionAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cancionero, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = CancionAdapter(emptyList()) { cancion ->
            val bundle = Bundle().apply {
                putString("titulo", cancion.titulo)
                putString("letra", cancion.letra)
                putString("audioPath", cancion.audioPath)
            }
            findNavController().navigate(R.id.action_deleFragment_to_leerCancionFragment, bundle)
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.songRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        viewModel.canciones.observe(viewLifecycleOwner) { canciones ->
            adapter.updateList(canciones)
        }

        val searchEditText = view.findViewById<EditText>(R.id.searchEditText)
        searchEditText.setOnEditorActionListener { _, _, _ ->
            viewModel.buscarCanciones(searchEditText.text.toString())
            true
        }

        val chipGroup = view.findViewById<ChipGroup>(R.id.categoryChipGroup)
        val categorias = CancioneroRepository.canciones.map { it.categoria }.distinct()
        categorias.forEach { categoria ->
            val chip = Chip(requireContext()).apply {
                text = categoria
                setOnClickListener { viewModel.filtrarPorCategoria(categoria) }
            }
            chipGroup.addView(chip)
        }
    }
}
