package com.example.rickandmorthyretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.layouttest.view.*

class Adapter(val ds:List<Character>):RecyclerView.Adapter<Adapter.itemViewHolder>() {

    inner class itemViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layouttest,parent,false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.itemView.apply {
            imageView.load(ds[position].image){
                transformations(CircleCropTransformation())
            }
            textView.setText(ds[position].name)
        }
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}