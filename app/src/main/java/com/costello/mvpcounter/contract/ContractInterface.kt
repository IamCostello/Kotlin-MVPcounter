package com.costello.mvpcounter.contract

interface ContractInterface {
    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun getCounter(): String
    }

    interface Model {
        fun incrementCounter()
        fun getCounter(): Int
    }
}