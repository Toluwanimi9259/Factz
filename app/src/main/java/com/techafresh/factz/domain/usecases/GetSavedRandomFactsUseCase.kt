package com.techafresh.factz.domain.usecases

import com.techafresh.factz.data.dataClasses.ApiResponseItem
import com.techafresh.factz.domain.repository.Repository
import kotlinx.coroutines.flow.Flow

class GetSavedRandomFactsUseCase(private val repo : Repository) {
    suspend fun execute() : Flow<List<ApiResponseItem>> = repo.getFactsFromDB()
}