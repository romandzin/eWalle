package com.example.ewalle

import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val people_icon = itemView.findViewById<ImageView>(R.id.people_icon)
    val people_name = itemView.findViewById<TextView>(R.id.people_name)
}

data class People(var people_icon: Drawable, var people_name: String)

class PeopleRecyclerAdapter(private val peopleList: List<People>): RecyclerView.Adapter<PeopleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.people_recyclerview_item, parent, false)

        return PeopleViewHolder(view)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val peopleListItem = peopleList[position]

        holder.people_icon.setImageDrawable(peopleListItem.people_icon)
        holder.people_name.text = peopleListItem.people_name
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
}