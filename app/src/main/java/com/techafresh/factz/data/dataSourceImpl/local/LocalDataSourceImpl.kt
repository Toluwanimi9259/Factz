package com.techafresh.factz.data.dataSourceImpl.local

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import com.techafresh.factz.data.dataSources.local.LocalDataSource
import com.techafresh.factz.data.room.dao.FactsDao
import kotlinx.coroutines.flow.Flow

class LocalDataSourceImpl(private val dao: FactsDao) : LocalDataSource {

    override suspend fun getSavedRandomFacts(): Flow<List<ApiResponseItem>> = dao.getSavedFacts()

    override suspend fun saveRandomFacts(apiResponseItem: List<ApiResponseItem>) {
        dao.saveFacts(apiResponseItem)
    }

}