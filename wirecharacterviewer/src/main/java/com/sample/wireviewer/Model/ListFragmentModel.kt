package com.sample.wireviewer.Model

import android.util.Log
import com.sample.commoncomps.Objects.Simpsons
import com.sample.commoncomps.WebServices.WebAPI
import com.sample.wireviewer.Constants
import com.sample.wireviewer.Contracts.IListFragmentContract
import com.sample.wireviewer.Presenters.ListFragmentPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListFragmentModel: IListFragmentContract.IModel {
    private val TAG=Constants.TAG+ListFragmentModel::class.simpleName
    lateinit var mPresenter: ListFragmentPresenter


    override fun setPresenter(mPresenter: ListFragmentPresenter){
        Log.d(TAG,"setPresenter")
        this.mPresenter=mPresenter

    }
    override fun fetchData(){
        Log.d(TAG,"fetchData")
        val apiService:WebAPI= WebAPI.create()
        val mCallGetWireCharacters=apiService.getWireCharactersData()
        mCallGetWireCharacters.enqueue(object : Callback<Simpsons?>{
            override fun onFailure(call: Call<Simpsons?>, t: Throwable) {
                mPresenter.onFailure(t)
            }

            override fun onResponse(call: Call<Simpsons?>, response: Response<Simpsons?>) {
                mPresenter.onSuccess(response)
            }

        })
    }
}


