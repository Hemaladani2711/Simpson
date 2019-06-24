package com.sample.wireviewer.Presenters

import android.content.Context
import android.util.Log
import com.sample.commoncomps.Objects.Simpsons
import com.sample.wireviewer.Constants
import com.sample.wireviewer.Contracts.IListFragmentContract
import com.sample.wireviewer.Model.ListAdapter
import retrofit2.Response

class ListFragmentPresenter(
    val mView: IListFragmentContract.IView,
    val mModel: IListFragmentContract.IModel,
    val context: Context?
):
    IListFragmentContract.IPresenter {
    private val TAG=Constants.TAG+ ListFragmentPresenter::class.simpleName

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