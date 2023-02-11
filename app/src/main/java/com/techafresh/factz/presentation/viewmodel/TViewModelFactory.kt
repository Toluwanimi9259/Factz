package com.techafresh.factz.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase

class TViewModelFactory(
    private val getRandomFactsUseCase: GetRandomFactsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TViewModel(getRandomFactsUseCase) as T
    }
}