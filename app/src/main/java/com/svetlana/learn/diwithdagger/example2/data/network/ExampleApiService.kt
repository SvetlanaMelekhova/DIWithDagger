package com.svetlana.learn.diwithdagger.example2.data.network

import android.content.Context
import android.util.Log
import com.svetlana.learn.diwithdagger.R
import com.svetlana.learn.diwithdagger.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeInMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timeInMillis $this")
    }

    companion object{
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}