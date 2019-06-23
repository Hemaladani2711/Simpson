package com.sample.simpsonviewer.Presenters

import android.content.Context
import android.util.Log
import com.sample.simpsonviewer.Constants
import com.sample.simpsonviewer.Contracts.IListFragmentContract
import com.sample.simpsonviewer.Model.ListAdapter
import com.sample.simpsonviewer.Objects.Simpsons
import retrofit2.Response

class ListFragmentPresenter(
    val mView: IListFragmentContract.IView,
    val mModel: IListFragmentContract.IModel,
    val context: Context?
):
    IListFragmentContract.IPresenter {
    private val TAG=Constants.TAG+ListFragmentPresenter::class.simpleName

    init {
        Log.d(TAG,"init")
        beginFetchData()
    }

    fun beginFetchData(){
        Log.d(TAG,"ibeginFetchData")
        mModel.setPresenter(this)
        mModel.fetchData()
    }
    override fun onSuccess(response: Response<Simpsons?>) {
        Log.d(TAG,"onSuccess")
        if(response.code()==200)
            mView.onDataReceived(ListAdapter(response.body(),context))

    }

    override fun onFailure(t: Throwable) {
        Log.d(TAG,"onFailure")
        mView.onDataFailed()
    }


}