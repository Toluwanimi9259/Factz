package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.domain.repository.Repository
import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase
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
}