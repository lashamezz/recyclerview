package com.android.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        val productList = ArrayList<product>()
        productList.add(product("https://img.drivemag.net/media/default/0001/23/thumb_22512_default_large.jpeg"))
        productList.add(product("https://gulf.ge/uploads/content/blog/p259/1.jpg"))
        productList.add(product("https://nationalmotormuseum.org.uk/wp-content/uploads/2017/11/Peel-P50-1962.jpg"))
        productList.add(product("https://uploads.carandclassic.co.uk/uploads/cars/bmw/13796799.jpg"))

        val adapter = ProductAdapter(productList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}