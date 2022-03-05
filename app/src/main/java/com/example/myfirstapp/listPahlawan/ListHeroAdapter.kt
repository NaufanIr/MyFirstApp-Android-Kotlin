package com.example.myfirstapp.listPahlawan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myfirstapp.R
import com.example.myfirstapp.listPahlawan.data.Hero

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgHero: ImageView = itemView.findViewById(R.id.img_heroes)
        var tvName: TextView = itemView.findViewById(R.id.tv_heroes_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_heros_desc)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.hero_item, parent, false)
        //val binding = ItemRowHeroBinding.inflate
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (img, name, desc) = listHero[position]
        //holder.imgHero.setImageResource(img)
        Glide.with(holder.itemView.context)
            .load(img) // URL Gambar
            .circleCrop() // Mengubah image menjadi lingkaran
            .into(holder.imgHero) // imageView mana yang akan diterapkan
        holder.tvName.text = name
        holder.tvDesc.text = desc
    }

    override fun getItemCount(): Int = listHero.size

}