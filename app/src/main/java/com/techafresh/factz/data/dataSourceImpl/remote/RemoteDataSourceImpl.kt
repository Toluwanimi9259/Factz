package com.techafresh.factz.data.dataSourceImpl.remote

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataSources.remote.RemoteDataSource
import com.techafresh.factz.data.retrofit.FactsAPI
import retrofit2.Response

class RemoteDataSourceImpl(private val api : FactsAPI) : RemoteDataSource {

    override suspend fun getRandomFacts(limit: String): Response<ApiResponse> = api.getRandomFacts(limit)
}