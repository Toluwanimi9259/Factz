package com.techafresh.factz.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase
import com.techafresh.factz.domain.usecases.GetSavedRandomFactsUseCase
import com.techafresh.factz.domain.usecases.SaveRandomFactsUseCase

class TViewModelFactory(
    private val getRandomFactsUseCase: GetRandomFactsUseCase,
    private val getSavedRandomFactsUseCase: GetSavedRandomFactsUseCase,
    private val saveRandomFactsUseCase: SaveRandomFactsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TViewModel(getRandomFactsUseCase , getSavedRandomFactsUseCase, saveRandomFactsUseCase) as T
    }
}