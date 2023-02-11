package com.techafresh.factz.data.retrofit

import com.techafresh.factz.BuildConfig
import com.techafresh.factz.data.dataClasses.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface FactsAPI {
    @Headers(
        "X-Api-Key:${BuildConfig.API_KEY}"
    )
    @GET("/v1/facts")
    suspend fun getRandomFacts(
        @Query("limit")
        limit : String
    ) : Response<ApiResponse>
}