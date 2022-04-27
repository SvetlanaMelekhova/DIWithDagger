package com.svetlana.learn.diwithdagger.example1

import javax.inject.Inject

class Computer(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
) {

    override fun toString() = "Hello, I'm Computer"
}