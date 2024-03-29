package com.sample.wireviewer.Views

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.wireviewer.Constants
import com.sample.wireviewer.Contracts.IListFragmentContract
import com.sample.wireviewer.Model.ListAdapter
import com.sample.wireviewer.Model.ListFragmentModel
import com.sample.wireviewer.Presenters.ListFragmentPresenter
import com.sample.wireviewer.R

class ListFragment: BaseFragment(),IListFragmentContract.IView{
    private val TAG=Constants.TAG+ListFragment::class.simpleName
    lateinit var mPresenter:ListFragmentPresenter
    lateinit var recyclerView: RecyclerView
    lateinit var txtDataNotAvailable:TextView

    override fun onDataFailed() {
        Log.d(TAG,"onDataFailed")
        txtDataNotAvailable.visibility=View.VISIBLE
        recyclerView.visibility=View.GONE
    }

    override fun onDataReceived(adapter: ListAdapter) {
        Log.d(TAG,"onDataReceived")
        txtDataNotAvailable.visibility=View.GONE
        recyclerView.visibility=View.VISIBLE
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=adapter
    }
    override fun getLayoutId(): Int {
        Log.d(TAG,"getLayoutId")
        return R.layout.list_container
    }


    override fun init(view: View) {
        Log.d(TAG,"init")
        recyclerView=view.findViewById(R.id.recyclerView)
        txtDataNotAvailable=view.findViewById(R.id.txtDataNotAvailable)
        mPresenter= ListFragmentPresenter(this,ListFragmentModel(),context)
    }
}