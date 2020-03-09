package com.costello.mvpcounter.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainActivityModel {
    private var counter: Int = 0

    fun getCounter() = counter

    fun incrementCounter() {
        counter++
    }
}