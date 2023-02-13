package com.techafresh.factz.presentation.hilt

import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase
import com.techafresh.factz.domain.usecases.GetSavedRandomFactsUseCase
import com.techafresh.factz.domain.usecases.SaveRandomFactsUseCase
import com.techafresh.factz.presentation.viewmodel.TViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Provides
    @Singleton
    fun provideViewModelFactoryModule(
        getRandomFactsUseCase: GetRandomFactsUseCase,
        getSavedRandomFactsUseCase: GetSavedRandomFactsUseCase,
        saveRandomFactsUseCase: SaveRandomFactsUseCase
    ) : TViewModelFactory{
        return TViewModelFactory(getRandomFactsUseCase , getSavedRandomFactsUseCase, saveRandomFactsUseCase)
    }
}