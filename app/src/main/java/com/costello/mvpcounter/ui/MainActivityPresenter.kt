package com.costello.mvpcounter.ui

import android.view.View
import com.costello.mvpcounter.contract.ContractInterface.*
import com.costello.mvpcounter.data.MainActivityModel
import com.costello.mvpcounter.ui.view.MainActivity

class MainActivityPresenter(_view: MainActivity) : Presenter {
    private val view: MainActivity = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}