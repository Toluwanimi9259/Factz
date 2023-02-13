package com.techafresh.factz.domain.usecases

import com.techafresh.factz.data.dataClasses.ApiResponseItem
import com.techafresh.factz.domain.repository.Repository

class SaveRandomFactsUseCase(private val repo : Repository) {
    suspend fun execute(apiResponseItem: List<ApiResponseItem>) = repo.saveFactsToDB(apiResponseItem)
}