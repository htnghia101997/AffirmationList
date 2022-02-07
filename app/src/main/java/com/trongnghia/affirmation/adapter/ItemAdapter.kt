package com.trongnghia.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.trongnghia.affirmation.R
import com.trongnghia.affirmation.model.Affirmation

class ItemAdapter(private val context: Context, private val listAffirmationAdapter: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {



    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val tvAffirmation: TextView = view.findViewById(R.id.tvAffirmation)
        val imgView: ImageView = view.findViewById(R.id.imgView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        val itemViewHolder: ItemViewHolder = ItemViewHolder(adapterLayout)
        return itemViewHolder
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data: Affirmation = listAffirmationAdapter[position]
        holder.tvAffirmation.text = context.resources.getString(data.stringResId)
        holder.imgView.setImageResource(data.drawableResId)

    }

    override fun getItemCount(): Int {
        return listAffirmationAdapter.size
    }
}