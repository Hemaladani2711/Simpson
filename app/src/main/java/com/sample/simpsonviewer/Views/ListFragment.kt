package com.sample.simpsonviewer.Views

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.simpsonviewer.Objects.Movie
import com.sample.simpsonviewer.R

class ListFragment: BaseFragment() {
    private val TAG= ListFragment::class.simpleName
    lateinit var recyclerView:RecyclerView

   /* private val mNicolasCageMovies = listOf(
        Movie("Raising Arizona", 1987),
        Movie("Vampire's Kiss", 1988),
        Movie("Con Air", 1997),
        Movie("Gone in 60 Seconds", 1997),
        Movie("National Treasure", 2004),
        Movie("The Wicker Man", 2006),
        Movie("Ghost Rider", 2007),
        Movie("Knowing", 2009)
    )
*/
    override fun getLayoutId(): Int {
        Log.d(TAG,"getLayoutId")
        return R.layout.list_container
    }


    override fun init(view: View) {
        Log.d(TAG,"init")
        recyclerView =view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(activity)
       // recyclerView.adapter=(ListAdapter(mNicolasCageMovies))
    }
}