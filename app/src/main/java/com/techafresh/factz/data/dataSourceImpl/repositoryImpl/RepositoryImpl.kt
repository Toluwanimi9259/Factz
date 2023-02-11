package com.techafresh.factz.data.dataSourceImpl.repositoryImpl

import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.data.dataSources.remote.RemoteDataSource
import com.techafresh.factz.domain.repository.Repository
import retrofit2.Response

class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {

    override suspend fun getRandomFacts(limit: String): Response<ApiResponse> = remoteDataSource.getRandomFacts(limit)
}