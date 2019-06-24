package com.sample.wireviewer.Views

import android.util.Log
import com.sample.wireviewer.Constants
import com.sample.wireviewer.R


class ListFragmentActivity: BaseActivity() {
    private val TAG= Constants.TAG+ ListFragmentActivity::class.simpleName
    override fun getLayoutId(): Int {
        Log.d(TAG,"getLayoutId")
        return R.layout.activity_main
    }

    override fun init() {
        Log.d(TAG, "init")
        fragmentTransaction(
            ListFragment(),
            R.id.layout_container_list_fragment
        )
    }
}