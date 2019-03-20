package com.example.vasialeleka.roomkotlin

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class User(firstName :String ,secondName: String , email : String) {

    @PrimaryKey
    val id : Int = 0

    @ColumnInfo(name = "first_name")
    val firstName = firstName
    @ColumnInfo(name = "second_name")
    val secondName = secondName

    @ColumnInfo(name = "email")
    val email = email
}