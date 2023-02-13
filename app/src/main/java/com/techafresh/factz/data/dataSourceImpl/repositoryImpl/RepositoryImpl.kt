package com.techafresh.factz.data.dataSourceImpl.repositoryImpl

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataClasses.ApiResponseItem
import com.techafresh.factz.data.dataSources.local.LocalDataSource
import com.techafresh.factz.data.dataSources.remote.RemoteDataSource
import com.techafresh.factz.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class RepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
    ) : Repository {

    override suspend fun getRandomFacts(limit: String): Response<ApiResponse> = remoteDataSource.getRandomFacts(limit)
    override suspend fun getFactsFromDB(): Flow<List<ApiResponseItem>> = localDataSource.getSavedRandomFacts()
    override suspend fun saveFactsToDB(apiResponseItem: List<ApiResponseItem>) {
        localDataSource.saveRandomFacts(apiResponseItem)
    }
}