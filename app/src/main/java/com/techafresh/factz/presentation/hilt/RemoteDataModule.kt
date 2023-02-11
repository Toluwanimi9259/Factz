package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.data.dataSourceImpl.remote.RemoteDataSourceImpl
import com.techafresh.factz.data.dataSources.remote.RemoteDataSource
import com.techafresh.factz.data.retrofit.FactsAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Provides
    @Singleton
    fun provideRemoteDataSource(api : FactsAPI) : RemoteDataSource{
        return RemoteDataSourceImpl(api)
    }
}