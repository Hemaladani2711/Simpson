package com.sample.wireviewer.Model

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sample.commoncomps.Objects.Simpsons
import com.sample.wireviewer.Constants
import com.sample.wireviewer.R

class ListAdapter(private val simpsons: Simpsons?, private val context: Context?):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private val TAG=Constants.TAG+ListAdapter::class.simpleName
    inner class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item,parent,false)) {
             var mTitle:TextView
             var mYear:TextView
        init {
            mTitle=itemView.findViewById(R.id.txtRelatedTopic)
            mYear=itemView.findViewById(R.id.Year)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG,"onCreateViewHolder")
        val inflater=LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        Log.d(TAG,"getItemCount")
        return simpsons!!.relatedTopics!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG,"onBindViewHolder")
        holder.mYear.setText(context!!.getText(R.string.click_to_view))
        holder.mTitle.setText(simpsons!!.relatedTopics!!.get(position).text)
    }



}