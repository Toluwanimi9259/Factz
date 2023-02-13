package com.techafresh.factz.data.dataSources.local

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    suspend fun getSavedRandomFacts() : Flow<List<ApiResponseItem>>

    suspend fun saveRandomFacts(apiResponseItem: List<ApiResponseItem>)
}