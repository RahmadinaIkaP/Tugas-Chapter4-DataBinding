package binar.academy.tugas_viewmodel_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import binar.academy.tugas_viewmodel_activity.databinding.ActivityDetailBeritaBinding
import binar.academy.tugas_viewmodel_activity.model.Berita

class DetailBeritaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_berita)

        binding.btnBackHome.setOnClickListener {
            onBackPressed()
        }

        val getData = intent.getParcelableExtra<Berita>("dataBerita") as Berita
        binding.beritaDetail = getData

    }
}