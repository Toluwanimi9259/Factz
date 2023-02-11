package com.techafresh.factz.data.dataSources.remote

import com.techafresh.factz.data.dataClasses.ApiResponse
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getRandomFacts(limit : String) : Response<ApiResponse>
}