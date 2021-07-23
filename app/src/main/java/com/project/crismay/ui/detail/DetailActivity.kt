package com.project.crismay.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.crismay.databinding.ActivityDetailBinding
import com.project.crismay.ui.pembayaran.PembayaranActivity
import com.project.crismay.ui.pembayaran.PembayaranActivity.Companion.COUNT2
import com.project.crismay.ui.pembayaran.PembayaranActivity.Companion.HARGA2
import com.project.crismay.ui.pembayaran.PembayaranActivity.Companion.KATEGORI2
import com.project.crismay.ui.pembayaran.PembayaranActivity.Companion.NAMA2

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    var count = 1

    companion object {
        const val ICON = "extra_icon"
        const val NAMA = "extra_nama"
        const val KATEGORI = "extra_kategori"
        const val DESKRIPSI = "extra_deskripsi"
        const val HARGA = "extra_harga"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Glide.with(this)
            .load(intent.getIntExtra(ICON, 0))
            .apply(RequestOptions().override(120, 160))
            .into(binding.imgDetailPhoto)

        with(binding) {
            tvDetailNama.text = intent.getStringExtra(NAMA)
            tvDetailKategori.text = intent.getStringExtra(KATEGORI)
            tvDetailDeskripsi.text = intent.getStringExtra(DESKRIPSI)
            tvDetailHarga.text = intent.getIntExtra(HARGA, 0).toString()

            detailBtnPlus.setOnClickListener {
                count++
                detailTvCount.text = count.toString()
            }

            detailBtnMinus.setOnClickListener {
                count--
                if(count < 1){
                    count = 1
                }
                detailTvCount.text = count.toString()
            }

            detailBtnLanjut.setOnClickListener {
                val intentShoes = Intent(this@DetailActivity, PembayaranActivity::class.java)

                intentShoes.apply {
                    putExtra(NAMA2, binding.tvDetailNama.text)
                    putExtra(KATEGORI2, KATEGORI)
                    putExtra(HARGA2, intent.getIntExtra(HARGA, 0))
                    putExtra(COUNT2, count)
                }
               startActivity(intentShoes)
            }

        }

    }
}