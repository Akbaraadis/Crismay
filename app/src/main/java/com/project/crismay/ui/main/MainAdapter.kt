package com.project.crismay.ui.main

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.crismay.R
import com.project.crismay.data.Produk
import com.project.crismay.ui.detail.DetailActivity

class MainAdapter (val listdata: ArrayList<Produk>, private val context: Context) : RecyclerView.Adapter<MainAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivIcon: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvKategori: TextView = itemView.findViewById(R.id.tv_item_kategori)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_item_harga)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_product, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val produk = listdata[position]
        Glide.with(holder.itemView.context)
            .load(produk.icon)
            .apply(RequestOptions().override(120, 160))
            .into(holder.ivIcon)
        holder.tvNama.text = produk.nama
        holder.tvKategori.text = produk.kategori
        holder.tvHarga.text = produk.harga.toString()

        holder.itemView.setOnClickListener {
            val intentShoes = Intent(context, DetailActivity::class.java)

            intentShoes.apply {
                putExtra(DetailActivity.ICON, produk.icon)
                putExtra(DetailActivity.NAMA, produk.nama)
                putExtra(DetailActivity.KATEGORI, produk.kategori)
                putExtra(DetailActivity.DESKRIPSI, produk.deskripsi)
                putExtra(DetailActivity.HARGA, produk.harga)
            }

            holder.itemView.context.startActivity(intentShoes)
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Produk)
    }

}