package com.sample.wireviewer.Contracts

import com.sample.commoncomps.Objects.Simpsons
import com.sample.wireviewer.Model.ListAdapter
import com.sample.wireviewer.Presenters.ListFragmentPresenter
import retrofit2.Response

interface IListFragmentContract {
    interface IView{
        fun onDataReceived(adapter: ListAdapter)
        fun onDataFailed()

    }

    interface IPresenter{
        fun onSuccess(response: Response<Simpsons?>)
        fun onFailure(t: Throwable)
    }

    interface IModel{
        fun fetchData()
        fun setPresenter(mPresenter: ListFragmentPresenter)

    }

}