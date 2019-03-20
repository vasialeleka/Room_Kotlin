package com.example.vasialeleka.roomkotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.LinearLayout
import com.example.vasialeleka.roomkotlin.R

import com.example.vasialeleka.roomkotlin.User
import com.example.vasialeleka.roomkotlin.adapters.UserAdapter

class MainActivity : AppCompatActivity() {
lateinit var listView :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var users = mutableListOf<User>()

        for ( i in 6 downTo 0 ){
            users.add (User("name" + i, "secondName", "email"))
        }
         Log.d("rer",""+users.size)
        listView=findViewById(R.id.list)
       listView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        listView.adapter = UserAdapter(users)
    }
}
