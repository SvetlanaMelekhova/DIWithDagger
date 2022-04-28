package com.svetlana.learn.diwithdagger.example2.di

import android.content.Context
import com.svetlana.learn.diwithdagger.example2.presentation.MainActivity
import com.svetlana.learn.diwithdagger.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun activityComponentFactory(): ActivityComponent.ActivityComponentFactory

    /*@Component.Builder
    interface AppComponentBuilder {

        @BindsInstance
        fun context(context: Context): AppComponentBuilder

        @BindsInstance
        fun currentTime(time: Long): AppComponentBuilder

        fun build(): AppComponent
    }*/

    @Component.Factory
    interface AppComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): AppComponent
    }
}