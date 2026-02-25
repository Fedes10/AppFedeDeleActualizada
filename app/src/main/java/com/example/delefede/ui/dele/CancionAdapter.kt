package com.example.delefede.ui.dele

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.delefede.R

class CancionAdapter(
    private var canciones: List<Cancion>,
    private val onCancionClick: (Cancion) -> Unit
) : RecyclerView.Adapter<CancionAdapter.CancionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cancion, parent, false)
        return CancionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CancionViewHolder, position: Int) {
        val cancion = canciones[position]
        holder.bind(cancion)
        holder.itemView.setOnClickListener { onCancionClick(cancion) }
    }

    override fun getItemCount(): Int = canciones.size

    fun updateList(newList: List<Cancion>) {
        canciones = newList
        notifyDataSetChanged()
    }

    class CancionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.songTitle)
        private val category: TextView = itemView.findViewById(R.id.songCategory)

        fun bind(cancion: Cancion) {
            title.text = cancion.titulo
            category.text = cancion.categoria
        }
    }
}
