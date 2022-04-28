package com.svetlana.learn.diwithdagger.example2.data.database

import android.content.Context
import android.util.Log
import com.svetlana.learn.diwithdagger.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeInMillis: Long
) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase $timeInMillis $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}