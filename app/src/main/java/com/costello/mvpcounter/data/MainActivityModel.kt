package com.costello.mvpcounter.data

import com.costello.mvpcounter.contract.ContractInterface

class MainActivityModel: ContractInterface.Model {
    private var counter = 0

    override fun getCounter() = counter

    override fun incrementCounter() {
        counter++
    }
}