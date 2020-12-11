package com.example.shoestore

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe



class MyShoesRecyclerViewAdapter(
        private val values: List<Shoe>)
    : RecyclerView.Adapter<MyShoesRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_shoe, parent, false)
        return ViewHolder(view)
    }

    //TODO: override ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.nameView.text = item.name
        holder.sizeView.text = item.size.toString()
        holder.companyView.text = item.company
        holder.descView.text = item.description
    }

    override fun getItemCount(): Int = values.size
    //TODO: this is redundant, right?
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.text_shoe_name)
        val sizeView: TextView = view.findViewById(R.id.text_shoe_size)
        val companyView: TextView = view.findViewById(R.id.text_shoe_company)
        val descView: TextView = view.findViewById(R.id.text_shoe_desc)


        override fun toString(): String {
            return super.toString() + " '" + nameView.text + "'"
        }
    }
}