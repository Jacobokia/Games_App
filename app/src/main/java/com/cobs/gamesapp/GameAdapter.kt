package com.cobs.gamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class GameAdapter(val gamelist:ArrayList<GameModel>):RecyclerView.Adapter<GameAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var gameimg: ImageView
        var gametitle:TextView

        init {
            gameimg = itemView.findViewById(R.id.cardviewimg)
            gametitle = itemView.findViewById(R.id.cardviewtxt)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
       return gamelist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameimg.setImageResource(gamelist[position].image)
        holder.gametitle.setText(gamelist[position].title)
    }
}