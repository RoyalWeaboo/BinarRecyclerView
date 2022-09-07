package com.malikazizali.binarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Malik", "A11.11252", R.drawable.ic_launcher_foreground),
            ListStudent("Aziz", "A11.17392", R.drawable.ic_launcher_foreground),
            ListStudent("Ali", "A11.39821", R.drawable.ic_launcher_foreground),
            ListStudent("Bambang", "A11.74922", R.drawable.ic_launcher_foreground),
            ListStudent("Anto", "A11.94293", R.drawable.ic_launcher_foreground)
        )

        var adapterStudent = StudentAdapter(listStudent)

        val layMan = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_student.layoutManager = layMan
        rv_student.adapter = adapterStudent


    }


}