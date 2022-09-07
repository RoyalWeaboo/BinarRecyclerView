package com.malikazizali.binarrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter (val listStudent: ArrayList<ListStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var namaStudent = view.findViewById<TextView>(R.id.namaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.nimStudent)
        var gambarStudent = view.findViewById<ImageView>(R.id.imageStudent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v  = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.gambarStudent.setImageResource(listStudent[position].gambar)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }


}