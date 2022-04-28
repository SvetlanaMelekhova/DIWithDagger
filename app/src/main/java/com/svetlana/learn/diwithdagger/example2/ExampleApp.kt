package com.svetlana.learn.diwithdagger.example2

import android.app.Application
import com.svetlana.learn.diwithdagger.example2.di.DaggerAppComponent

class ExampleApp: Application() {

    val component by lazy {
        DaggerAppComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}