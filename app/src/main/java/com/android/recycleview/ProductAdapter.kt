package com.android.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private var Products:List<product>, private val context:Context): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = Products[position]

        Glide.with(context)
                .load(product.imageLink)
                .placeholder(R.drawable.ic_baseline_camera_alt_24)
                .centerCrop()
                .into(holder.imageView)
    }

    override fun getItemCount(): Int  = Products.size

}