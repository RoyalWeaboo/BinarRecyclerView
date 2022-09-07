package com.malikazizali.binarrecyclerview.rumahadat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.malikazizali.binarrecyclerview.ListStudent
import com.malikazizali.binarrecyclerview.R
import com.malikazizali.binarrecyclerview.StudentAdapter
import kotlinx.android.synthetic.main.activity_daerah.*
import kotlinx.android.synthetic.main.activity_main.*

class DaerahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daerah)

        val listDaerah = arrayListOf(
            ListDaerah("Bali", "Denpasar", R.drawable.bali),
            ListDaerah("Jawa Barat", "Bandung", R.drawable.jabar),
            ListDaerah("Jawa Timur", "Surabaya", R.drawable.jatim),
            ListDaerah("Kalimantan Barat", "Pontianak", R.drawable.kalbar),
            ListDaerah("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut),
            ListDaerah("Nusa Tenggara Barat", "Mataram", R.drawable.ntb),
            ListDaerah("Papua", "Denpasar", R.drawable.papua),
            ListDaerah("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh),
            ListDaerah("Sulawesi Utara", "Manado", R.drawable.sulut),
            ListDaerah("Sumatra Barat", "Padang", R.drawable.sumbar)
        )

        var adapterDaerah = DaerahAdapter(listDaerah)

        val layMan = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_daerah.layoutManager = layMan
        rv_daerah.adapter = adapterDaerah
    }
}