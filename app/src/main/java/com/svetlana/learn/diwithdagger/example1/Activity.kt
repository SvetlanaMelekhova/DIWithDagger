package com.svetlana.learn.diwithdagger.example1

class Activity {

    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}