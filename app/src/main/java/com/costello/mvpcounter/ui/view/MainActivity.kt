package com.costello.mvpcounter.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.costello.mvpcounter.R
import com.costello.mvpcounter.contract.ContractInterface.*
import com.costello.mvpcounter.ui.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View {
    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        counterButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
