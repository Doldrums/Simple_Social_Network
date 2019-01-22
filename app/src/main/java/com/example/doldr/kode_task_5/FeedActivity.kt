package com.example.doldr.kode_task_5

import android.media.Image
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_feed.*

class FeedActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        setSupportActionBar(toolbar)

        val name = mutableListOf<String>()
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")
        name.add("Christmas Cakes")

        val recyclerView: RecyclerView = findViewById(R.id.my_recycler_view)

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    recyclerView.layoutManager = LinearLayoutManager(this)
                    recyclerView.adapter = Adapter(name, 1)
                    toolbar_layout.setBackgroundResource(R.drawable.background1)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_dashboard -> {
                    recyclerView.layoutManager = LinearLayoutManager(this)
                    recyclerView.adapter = Adapter(name, 2)
                    toolbar_layout.setBackgroundResource(R.drawable.background)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_notifications -> {
                    recyclerView.layoutManager = LinearLayoutManager(this)
                    recyclerView.adapter = Adapter(name, 3)
                    toolbar_layout.setBackgroundResource(R.drawable.background2)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    class Adapter(private val name: List<String>, private val what: Int): RecyclerView.Adapter<Adapter.ViewHolder>(){
        var i =0
        lateinit var itemView : View
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            i++
            when (what) {
                2 -> when {
                    i % 2 == 0 -> itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_notification, parent, false)
                    else -> itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
                }
                1 -> itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
                3 -> itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_notification, parent, false)
            }
            return  ViewHolder(itemView)

        }
        override fun onBindViewHolder(holder : ViewHolder, position: Int) {
            if (what == 1) holder.name?.text = name[position]
            else if ( what == 2) {

                if (i % 2 == 0) {
                    holder.name?.text = "Notification"
                } else {
                    holder.name?.text = name[position]
                }
            }
            else if (what == 3) holder.name?.text = "Notification"
        }
        override fun getItemCount() = name.size
        class  ViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView!!){
            var name: TextView? = null
            var description: TextView? = null
            init {
                name = itemView?.findViewById(R.id.name)
                description = itemView?.findViewById(R.id.discription) }
        }




    }
}


