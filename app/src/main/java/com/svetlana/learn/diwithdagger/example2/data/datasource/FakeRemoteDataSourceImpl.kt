package com.svetlana.learn.diwithdagger.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class FakeRemoteDataSourceImpl @Inject constructor(
): ExampleRemoteDataSource {

    override fun method() {
        Log.d("hhhh", "ky-ky")
    }
}