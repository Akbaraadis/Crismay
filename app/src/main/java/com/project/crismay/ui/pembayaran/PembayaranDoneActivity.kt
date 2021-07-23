package com.project.crismay.ui.pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.crismay.R
import com.project.crismay.databinding.ActivityPembayaranBinding
import com.project.crismay.databinding.ActivityPembayaranDoneBinding
import com.project.crismay.ui.main.MainActivity

class PembayaranDoneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPembayaranDoneBinding

    var harga = 0
    var count = 0
    var total = 0

    companion object {
        const val NAMA = "extra_nama"
        const val HARGA = "extra_harga"
        const val COUNT = "extra_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaranDoneBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding) {
            pmbdKeterangan.text = intent.getStringExtra(NAMA)
            harga = intent.getIntExtra(HARGA, 0)
            count = intent.getIntExtra(COUNT, 0)

            total = harga * count

            pmbdTotalBayar.text = total.toString()
            pmbdCount.text = intent.getIntExtra(COUNT, 0).toString()

            pmbdBtnLanjut.setOnClickListener {
                val intentShoes = Intent(this@PembayaranDoneActivity, MainActivity::class.java)
                startActivity(intentShoes)
            }
        }
    }
}