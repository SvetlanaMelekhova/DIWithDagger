package com.svetlana.learn.diwithdagger.example2.di

import com.svetlana.learn.diwithdagger.example2.presentation.MainActivity
import com.svetlana.learn.diwithdagger.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface ActivityComponentFactory{

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }

}