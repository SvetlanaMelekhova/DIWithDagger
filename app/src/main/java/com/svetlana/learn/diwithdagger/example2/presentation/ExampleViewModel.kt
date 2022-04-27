package com.svetlana.learn.diwithdagger.example2.presentation

import androidx.lifecycle.ViewModel
import com.svetlana.learn.diwithdagger.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
    }
}