package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.data.dataSourceImpl.repositoryImpl.RepositoryImpl
import com.techafresh.factz.data.dataSources.remote.RemoteDataSource
import com.techafresh.factz.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(remoteDataSource: RemoteDataSource) : Repository{
        return RepositoryImpl(remoteDataSource)
    }
}