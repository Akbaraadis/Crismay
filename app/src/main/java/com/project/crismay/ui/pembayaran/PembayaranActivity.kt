package com.project.crismay.ui.pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.crismay.databinding.ActivityPembayaranBinding
import com.project.crismay.ui.detail.DetailActivity

class PembayaranActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPembayaranBinding

    var harga = 0
    var count = 0
    var total = 0

    companion object {
        const val NAMA2 = "extra_nama"
        const val KATEGORI2 = "extra_kategori"
        const val HARGA2 = "extra_harga"
        const val COUNT2 = "extra_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaranBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding) {
            pmbKeterangan.text = intent.getStringExtra(NAMA2)
            harga = intent.getIntExtra(HARGA2, 0)
            count = intent.getIntExtra(COUNT2, 0)

            total = harga * count

            pmbTotalBayar.text = total.toString()
            pmbCount.text = intent.getIntExtra(COUNT2, 0).toString()

            pmbBtnLanjut.setOnClickListener {
                val intentShoes = Intent(this@PembayaranActivity, PembayaranDoneActivity::class.java)

                intentShoes.apply {
                    putExtra(NAMA2, binding.pmbKeterangan.text)
                    putExtra(HARGA2, intent.getIntExtra(HARGA2, 0))
                    putExtra(COUNT2, count)
                }
                Toast.makeText(this@PembayaranActivity, "Pembayaran Berhasil", Toast.LENGTH_SHORT).show()
                startActivity(intentShoes)
            }
        }
    }
}