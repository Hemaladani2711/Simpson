package com.sample.simpsonviewer.Views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {
    private val TAG= BaseFragment::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        val view = inflater.inflate(getLayoutId(),container,false)
        init(view)
        return view
    }


    protected abstract fun getLayoutId():Int

    protected abstract fun init(view:View)
}