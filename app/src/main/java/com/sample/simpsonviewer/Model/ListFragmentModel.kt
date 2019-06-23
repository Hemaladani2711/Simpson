package com.sample.simpsonviewer.Model

import android.util.Log
import com.sample.simpsonviewer.Constants
import com.sample.simpsonviewer.Contracts.IListFragmentContract
import com.sample.simpsonviewer.Objects.Simpsons
import com.sample.simpsonviewer.Presenters.ListFragmentPresenter
import com.sample.simpsonviewer.WebServices.WebAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListFragmentModel:IListFragmentContract.IModel {
    private val TAG=Constants.TAG+ListFragmentModel::class.simpleName
    lateinit var mPresenter: ListFragmentPresenter


    override fun setPresenter(mPresenter:ListFragmentPresenter){
        Log.d(TAG,"setPresenter")
        this.mPresenter=mPresenter

    }
    override fun fetchData(){
        Log.d(TAG,"fetchData")
        val apiService:WebAPI=WebAPI.create()
        val mCallGetSimpsonData=apiService.getSimpsonsData()
        mCallGetSimpsonData.enqueue(object : Callback<Simpsons?>{
            override fun onFailure(call: Call<Simpsons?>, t: Throwable) {
                mPresenter.onFailure(t)
            }

            override fun onResponse(call: Call<Simpsons?>, response: Response<Simpsons?>) {
                mPresenter.onSuccess(response)
            }

        })
    }
}