package com.costello.mvpcounter.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.costello.mvpcounter.R
import com.costello.mvpcounter.data.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        mainActivityViewModel.mutableLiveData.observe(this, Observer { updateViewData() })

        counterButton.setOnClickListener { mainActivityViewModel.incrementValue() }
    }

    fun updateViewData() {
        counterTextView.text = mainActivityViewModel.mainActivityModel.getCounter().toString()
    }
}
