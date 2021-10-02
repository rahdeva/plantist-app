package com.example.plantist

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class GridPlantsAdapter(val listPlants: ArrayList<Plants>) : RecyclerView.Adapter<GridPlantsAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgbtnFavourite: ImageButton = itemView.findViewById(R.id.imgbtn_fav)
        var imgbtnShare: ImageButton = itemView.findViewById(R.id.imgbtn_share)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridPlantsAdapter.GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_plants, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridPlantsAdapter.GridViewHolder, position: Int) {
        val plants = listPlants[position]
        Glide.with(holder.itemView.context)
            .load(listPlants[position].photo)
            .apply(RequestOptions().override(720, 1080))
            .into(holder.imgPhoto)
        holder.tvName.text = plants.name

        holder.imgbtnFavourite.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favourite " + listPlants[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
        holder.imgbtnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listPlants[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

//            val bitmap = BitmapFactory.decodeResource(holder.imgbtnShare.context.resources, listPlants[holder.adapterPosition].photo)
//            val bitmapPath = MediaStore.Images.Media.insertImage(holder.imgbtnShare.context.getContentResolver(), bitmap, listPlants[holder.adapterPosition].name, null)
//            val bitmapUri = Uri.parse(bitmapPath)
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT, listPlants[holder.adapterPosition].shareMessage)
//            shareIntent.putExtra(Intent.EXTRA_STREAM, bitmapUri)
            shareIntent.setType("text/plain")
//            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
//            holder.imgbtnShare.context.startActivity(Intent.createChooser(shareIntent, "Share to"))
            holder.imgbtnShare.context.startActivity(shareIntent)

        }

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPlants[holder.adapterPosition])
            val detailIntent = Intent(holder.itemView.context,DetailActivity::class.java)
            detailIntent.putExtra("plants_name", listPlants[holder.adapterPosition].name)
            detailIntent.putExtra("plants_photo", listPlants[holder.adapterPosition].photo)
            detailIntent.putExtra("plants_detail", listPlants[holder.adapterPosition].detail)
            detailIntent.putExtra("plants_description", listPlants[holder.adapterPosition].description)
            detailIntent.putExtra("plants_water", listPlants[holder.adapterPosition].water)
            detailIntent.putExtra("plants_illumination", listPlants[holder.adapterPosition].illumination)
            detailIntent.putExtra("plants_temperature", listPlants[holder.adapterPosition].temperature)
            detailIntent.putExtra("plants_fertilizer", listPlants[holder.adapterPosition].fertilizer)
            holder.itemView.context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int {
        return listPlants.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Plants)
    }
}