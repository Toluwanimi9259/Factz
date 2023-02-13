package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.domain.repository.Repository
import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase
import com.techafresh.factz.domain.usecases.GetSavedRandomFactsUseCase
import com.techafresh.factz.domain.usecases.SaveRandomFactsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UsecaseModule {

    @Provides
    @Singleton
    fun provideGetRandomFactsUseCase(repo : Repository) : GetRandomFactsUseCase{
        return GetRandomFactsUseCase(repo)
    }

    @Provides
    @Singleton
    fun provideGetSavedRandomFactsUseCase(repo: Repository) : GetSavedRandomFactsUseCase{
        return GetSavedRandomFactsUseCase(repo)
    }

    @Provides
    @Singleton
    fun provideSavedRandomFactsUseCase(repo : Repository) : SaveRandomFactsUseCase{
        return SaveRandomFactsUseCase(repo)
    }
}