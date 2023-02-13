package com.techafresh.factz.domain.repository

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface Repository {

    suspend fun getRandomFacts(limit : String) : Response<ApiResponse>

    suspend fun getFactsFromDB() : Flow<List<ApiResponseItem>>

    suspend fun saveFactsToDB(apiResponseItem: List<ApiResponseItem>)

}