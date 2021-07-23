package com.project.crismay.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.project.crismay.data.Dummy_Produk
import com.project.crismay.data.Produk
import com.project.crismay.databinding.ActivityMainBinding
import com.project.crismay.ui.main.MainAdapter

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Produk> = arrayListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainRecycle.setHasFixedSize(true)

        list.addAll(Dummy_Produk.listdata)
        showRecyclerView()

    }

    private fun showRecyclerView() {
        binding.mainRecycle.layoutManager = GridLayoutManager(this, 2)
        val cardViewAdapter = MainAdapter(list, this)
        binding.mainRecycle.adapter = cardViewAdapter
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}