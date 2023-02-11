package com.techafresh.factz.domain.repository

import com.techafresh.factz.data.dataClasses.ApiResponse
import retrofit2.Response

interface Repository {

    suspend fun getRandomFacts(limit : String) : Response<ApiResponse>

}