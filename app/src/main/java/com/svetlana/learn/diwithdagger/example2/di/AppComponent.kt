package com.svetlana.learn.diwithdagger.example2.di

import com.svetlana.learn.diwithdagger.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}