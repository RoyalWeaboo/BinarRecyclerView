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
            ListDaerah("Nanggroe Aceh \nDarussalam", "Banda Aceh", R.drawable.aceh),
            ListDaerah("Sumatra Utara", "Medan", R.drawable.sumut),
            ListDaerah("Sumatra Selatan", "Palembang", R.drawable.sumsel),
            ListDaerah("Sumatra Barat", "Padang", R.drawable.sumbar),
            ListDaerah("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            ListDaerah("Riau", "Pekanbaru", R.drawable.riau),
            ListDaerah("Kepulauan Riau", "Tanjung Pinang", R.drawable.kepriau),
            ListDaerah("Jambi", "Jambi", R.drawable.jambi),
            ListDaerah("Lampung", "Bandar Lampung", R.drawable.lampung),
            ListDaerah("Bangka Belitung", "Pangkal Pinang", R.drawable.bangkabelitung),
            ListDaerah("Kalimantan Timur", "Samarinda", R.drawable.kaltim),
            ListDaerah("Kalimantan Barat", "Pontianak", R.drawable.kalbar),
            ListDaerah("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng),
            ListDaerah("Kalimantan Selatan", "Banjarbaru", R.drawable.kalsel),
            ListDaerah("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut),
            ListDaerah("DKI Jakarta", "Jakarta", R.drawable.jakarta),
            ListDaerah("Banten", "Serang", R.drawable.banten),
            ListDaerah("Jawa Barat", "Bandung", R.drawable.jabar),
            ListDaerah("Jawa Tengah", "Semarang", R.drawable.jateng),
            ListDaerah("DI Yogyakarta", "Yogyakarta", R.drawable.jogja),
            ListDaerah("Jawa Timur", "Surabaya", R.drawable.jatim),
            ListDaerah("Bali", "Denpasar", R.drawable.bali),
            ListDaerah("Nusa Tenggara Barat", "Mataram", R.drawable.ntb),
            ListDaerah("Nusa Tenggara Timur", "Kupang", R.drawable.ntt),
            ListDaerah("Sulawesi Utara", "Manado", R.drawable.sulut),
            ListDaerah("Sulawesi Barat", "Mamuju", R.drawable.sulbar),
            ListDaerah("Sulawesi Tengah", "Palu", R.drawable.sulteng),
            ListDaerah("Gorontalo", "Gorontalo", R.drawable.gorontalo),
            ListDaerah("Sulawesi Tenggara", "Kendari", R.drawable.sultenggara),
            ListDaerah("Sulawesi Selatan", "Makassar", R.drawable.sulsel),
            ListDaerah("Maluku Utara", "Sofifi ", R.drawable.malut),
            ListDaerah("Maluku", "Ambon", R.drawable.maluku),
            ListDaerah("Papua Barat", "Manokwari", R.drawable.papuabarat),
            ListDaerah("Papua", "Jayapura", R.drawable.papua),
            ListDaerah("Papua Selatan", "Kabupaten Merauke", R.drawable.papuaselatan),
            ListDaerah("Papua Tengah", "Kabupaten Nabire", R.drawable.papuatengah),
            ListDaerah("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.papuapegunungan),
        )

        var adapterDaerah = DaerahAdapter(listDaerah)

        val layMan = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_daerah.layoutManager = layMan
        rv_daerah.adapter = adapterDaerah
    }
}