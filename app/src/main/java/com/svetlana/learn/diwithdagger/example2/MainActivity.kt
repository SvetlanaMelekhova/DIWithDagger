package com.svetlana.learn.diwithdagger.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.svetlana.learn.diwithdagger.R
import com.svetlana.learn.diwithdagger.example1.Activity
import com.svetlana.learn.diwithdagger.example1.Computer
import com.svetlana.learn.diwithdagger.example1.DaggerNewComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerNewComponent.create().inject(this)
        Log.d("hhhh", "computer = $computer")
    }
}