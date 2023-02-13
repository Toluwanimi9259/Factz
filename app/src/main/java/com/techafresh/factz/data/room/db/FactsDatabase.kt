package com.techafresh.factz.data.room.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import com.techafresh.factz.data.room.dao.FactsDao

@Database(entities = [ApiResponseItem::class] , exportSchema = false, version = 1)
abstract class FactsDatabase : RoomDatabase(){
    abstract fun factsDao() : FactsDao
}