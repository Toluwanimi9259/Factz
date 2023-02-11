package com.techafresh.factz.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techafresh.factz.data.dataClasses.ApiResponse
import com.techafresh.factz.domain.usecases.GetRandomFactsUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class TViewModel(
    private val getRandomFactsUseCase: GetRandomFactsUseCase
) : ViewModel() {

    val randomFactsLiveData : MutableLiveData<Response<ApiResponse>> = MutableLiveData()

    fun getRandomFacts(limit : String) = viewModelScope.launch {
        try {
            randomFactsLiveData.postValue(getRandomFactsUseCase.execute(limit))
        }catch (ex : Exception){
           Log.d("MYTAG" , "VIEW MODEL : " + ex.message)
        }
    }
}