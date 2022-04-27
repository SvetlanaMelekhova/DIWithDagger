package com.svetlana.learn.diwithdagger.example2.data.database

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}