package com.example.vasialeleka.roomkotlin.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.vasialeleka.roomkotlin.R
import com.example.vasialeleka.roomkotlin.User


class UserAdapter(var users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserAdapter.ViewHolder {
      val view = LayoutInflater.from(p0.context).inflate(R.layout.item ,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return users.size
        }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
       p0.name.text = users[p1].firstName
        p0.secondName.text = users[p1].firstName
        p0.email.text = users[p1].firstName
    }

    class ViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        lateinit var name :TextView
        lateinit var secondName :TextView
        lateinit var email :TextView
    }

}