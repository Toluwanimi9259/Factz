package com.techafresh.factz.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import kotlinx.coroutines.flow.Flow

@Dao
interface FactsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveFacts(apiResponseItem : List<ApiResponseItem>)

    @Query("SELECT * FROM random_facts ORDER BY id ASC")
    fun getSavedFacts() : Flow<List<ApiResponseItem>>
}