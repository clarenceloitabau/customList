package com.example.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = findViewById(R.id.mListView)
        users = ArrayList()
        adapter = CustomAdapter(this,users!!)
        //start creating users
        var user1 = User(R.mipmap.imgone,"Lucas","0115816970")
        var user2 = User(R.mipmap.imgtwo,"Cole","0725850786")
        var user3 = User(R.mipmap.imgthree,"Baby","0718147604")
        var user4 = User(R.mipmap.imgfour,"Ye","0758551427")
        var user5 = User(R.mipmap.imgfive,"Lamar","0115816970")
        //add thectreated array list of users
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
       //
        mList!!.adapter = adapter!!

    }
}