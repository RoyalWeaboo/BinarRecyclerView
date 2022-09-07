package com.malikazizali.binarrecyclerview.rumahadat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.malikazizali.binarrecyclerview.R

class DaerahAdapter (val daerah : ArrayList<ListDaerah>) :RecyclerView.Adapter<DaerahAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var namaProvinsi = view.findViewById<TextView>(R.id.namaProvinsi)
        var namaIbuKota = view.findViewById<TextView>(R.id.namaIbuKota)
        var gambarRumahAdat = view.findViewById<ImageView>(R.id.imageRumahAdat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v  = LayoutInflater.from(parent.context).inflate(R.layout.card_daerah, parent, false)
        return DaerahAdapter.ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = daerah[position].provinsi
        holder.namaIbuKota.text = daerah[position].ibuKota
        holder.gambarRumahAdat.setImageResource(daerah[position].rumahAdat)
    }

    override fun getItemCount(): Int {
        return daerah.size
    }
}