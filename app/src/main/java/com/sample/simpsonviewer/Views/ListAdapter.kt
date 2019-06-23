package com.sample.simpsonviewer.Views

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sample.simpsonviewer.Objects.Movie
import com.sample.simpsonviewer.R

class ListAdapter(private val list:List<Movie>):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    inner class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item,parent,false)) {

             var mTitle:TextView
             var mYear:TextView
        init {
            mTitle=itemView.findViewById(R.id.titleMovie)
            mYear=itemView.findViewById(R.id.Year)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mYear.setText(list.get(position).s)
        holder.mTitle.setText(list.get(position).i.toString())
    }



}