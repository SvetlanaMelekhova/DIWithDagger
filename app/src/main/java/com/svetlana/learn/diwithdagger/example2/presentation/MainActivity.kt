package com.svetlana.learn.diwithdagger.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.svetlana.learn.diwithdagger.R
import com.svetlana.learn.diwithdagger.example1.DaggerNewComponent

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerNewComponent.create().inject(this)
        viewModel.method()
    }
}