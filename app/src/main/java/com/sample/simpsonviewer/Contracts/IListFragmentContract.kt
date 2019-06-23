package com.sample.simpsonviewer.Contracts

import com.sample.simpsonviewer.Model.ListAdapter
import com.sample.simpsonviewer.Objects.Simpsons
import com.sample.simpsonviewer.Presenters.ListFragmentPresenter
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