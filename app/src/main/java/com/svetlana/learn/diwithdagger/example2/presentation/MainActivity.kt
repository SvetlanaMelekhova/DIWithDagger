package com.svetlana.learn.diwithdagger.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.svetlana.learn.diwithdagger.R
import com.svetlana.learn.diwithdagger.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerAppComponent.factory()
            .create(application, System.currentTimeMillis())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}