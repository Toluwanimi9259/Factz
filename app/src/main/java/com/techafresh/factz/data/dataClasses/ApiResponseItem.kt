package com.techafresh.factz.data.dataClasses

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "random_facts")
data class ApiResponseItem(

    @PrimaryKey(autoGenerate = true)
    val id : Int?,

    val fact: String
)