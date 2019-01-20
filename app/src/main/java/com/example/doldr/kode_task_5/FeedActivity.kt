package com.example.doldr.kode_task_5

import android.os.Bundle
import android.support.design.widget.Snackbar
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
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = Adapter(name)
    }


    class Adapter(private val name: List<String>): RecyclerView.Adapter<Adapter.ViewHolder>(){
        var i =0
        lateinit var itemView : View
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            i++
            if (i%2==0) {
                itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_notification, parent, false)
            }
            else {
                itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            }
            return  ViewHolder(itemView)

        }
        override fun onBindViewHolder(holder : ViewHolder, position: Int) {
            if (i%2==0) {
                holder.name?.text = "Notification"
            }
            else {
                holder.name?.text = name[position]
            }
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


