package com.sample.wireviewer.Views

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.sample.wireviewer.Constants

abstract class BaseActivity : AppCompatActivity(){

    private val TAG= Constants.TAG+ BaseActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        init()
    }

    /*To assign separate layout to activity or fragments*/
    abstract fun getLayoutId(): Int

    /*To configure view elements and perform onCreate functions*/
    abstract fun init()

    /*To perform fragment transactions*/
    fun fragmentTransaction(fragment:Fragment,layoutId:Int){
        Log.d(TAG,"fragmentTransaction")
        val fragmentManager:FragmentManager=supportFragmentManager
        val fragmentTransction:FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransction.replace(layoutId,fragment).addToBackStack(fragment::class.simpleName).commit()
    }
}
