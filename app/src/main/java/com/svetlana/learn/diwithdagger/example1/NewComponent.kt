package com.svetlana.learn.diwithdagger.example1

import com.svetlana.learn.diwithdagger.example2.MainActivity
import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: MainActivity)
}