package com.example.kotlin_pr2.UI.View

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.kotlin_pr2.R
import com.example.kotlin_pr2.UI.StateHolder.ViewModel.MyViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_container)

        val viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        viewModel.data.observe(this, Observer { data ->
            // обновление UI с новыми данными
        })
    }
}