package com.techafresh.factz.domain.usecases

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.domain.repository.Repository
import retrofit2.Response

class GetRandomFactsUseCase(private val repo : Repository) {
    suspend fun execute(limit : String) : Response<ApiResponse> = repo.getRandomFacts(limit)

}