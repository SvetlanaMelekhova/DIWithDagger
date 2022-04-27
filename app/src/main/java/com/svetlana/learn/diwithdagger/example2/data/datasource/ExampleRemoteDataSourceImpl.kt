package com.svetlana.learn.diwithdagger.example2.data.datasource

import com.svetlana.learn.diwithdagger.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}