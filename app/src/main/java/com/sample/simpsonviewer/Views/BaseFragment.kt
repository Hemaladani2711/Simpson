package com.sample.simpsonviewer.Views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sample.simpsonviewer.Constants

abstract class BaseFragment: Fragment() {
    private val TAG= Constants.TAG+BaseFragment::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        retainInstance=true
        val view = inflater.inflate(getLayoutId(),container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG,"onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    protected abstract fun getLayoutId():Int

    protected abstract fun init(view:View)
}