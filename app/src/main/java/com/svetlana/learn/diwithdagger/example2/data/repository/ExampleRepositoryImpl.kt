package com.svetlana.learn.diwithdagger.example2.data.repository

import com.svetlana.learn.diwithdagger.example2.data.datasource.ExampleLocalDataSource
import com.svetlana.learn.diwithdagger.example2.data.datasource.ExampleRemoteDataSource
import com.svetlana.learn.diwithdagger.example2.data.mapper.ExampleMapper
import com.svetlana.learn.diwithdagger.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
    ): ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}