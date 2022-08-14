package com.example.project_2_recyclerview_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.model.Sneakers



class Adapter(
    private val dataset : List<Sneakers>,
    private val context: Context
) : RecyclerView.Adapter<Adapter.SneakersViewHolder>() {

  class SneakersViewHolder(itemLayout: View) : RecyclerView.ViewHolder(itemLayout) {
      val imageView: ImageView = itemLayout.findViewById(R.id.item_image)
      val textView: TextView = itemLayout.findViewById(R.id.item_title)
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SneakersViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return SneakersViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: SneakersViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.setText(item.SneakersStringId)
        holder.imageView.setImageResource(item.SneakersImageId)

    }

    override fun getItemCount() = dataset.size


}