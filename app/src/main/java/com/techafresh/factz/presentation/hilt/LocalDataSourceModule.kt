package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.data.dataSourceImpl.local.LocalDataSourceImpl
import com.techafresh.factz.data.dataSources.local.LocalDataSource
import com.techafresh.factz.data.room.dao.FactsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataSourceModule {

    @Provides
    @Singleton
    fun provideLocalDataSource(dao : FactsDao): LocalDataSource{
        return LocalDataSourceImpl(dao)
    }
}