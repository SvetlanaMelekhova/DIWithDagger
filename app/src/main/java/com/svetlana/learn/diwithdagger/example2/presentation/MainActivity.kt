package com.svetlana.learn.diwithdagger.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.svetlana.learn.diwithdagger.R
import com.svetlana.learn.diwithdagger.example2.di.ContextModule
import com.svetlana.learn.diwithdagger.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerAppComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}