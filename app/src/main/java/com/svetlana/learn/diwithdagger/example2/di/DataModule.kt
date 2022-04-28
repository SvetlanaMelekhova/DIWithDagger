package com.svetlana.learn.diwithdagger.example2.di

import com.svetlana.learn.diwithdagger.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    @ApplicationScope
    @RemoteQualifier
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @Binds
    @ApplicationScope
    @FakeQualifier
    fun bindFakeRemoteDataSource(impl: FakeRemoteDataSourceImpl): ExampleRemoteDataSource
}