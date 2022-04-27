package com.svetlana.learn.diwithdagger.example2.data.datasource

import com.svetlana.learn.diwithdagger.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
): ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}