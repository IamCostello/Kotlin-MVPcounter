package com.costello.mvpcounter.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val mutableLiveData: MutableLiveData<MainActivityModel> by lazy {
        MutableLiveData<MainActivityModel>()
    }
    val mainActivityModel: MainActivityModel

    init{
        mainActivityModel = MainActivityModel()
        mutableLiveData.postValue(mainActivityModel)
    }

    fun incrementValue(){
        mainActivityModel.incrementCounter()
        mutableLiveData.postValue(mainActivityModel)
    }
}