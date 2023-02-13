package com.techafresh.factz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techafresh.factz.databinding.ActivityMainBinding
import com.techafresh.factz.presentation.viewmodel.TViewModel
import com.techafresh.factz.presentation.viewmodel.TViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding

    @Inject
    lateinit var viewModelFactory: TViewModelFactory

    lateinit var viewModel : TViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this , viewModelFactory)[TViewModel::class.java]

        Log.d("MYTAG" , "Implicit logical operators")

        viewModel.getRandomFacts("100")

        viewModel.randomFactsLiveData.observe(this , Observer {
            Log.d("MYTAG" , "jjfjfjfjfjfjfjfjfjfjfj")
            try {
                Log.d("MYTAG" , "Data : ${it.body()!!.toList()}")
                viewModel.saveRandomFacts(it.body()!!)
            }catch (ex : Exception){
                Log.d("MYTAG" , "Exception : ${ex.message}")
            }
        })
    }
}