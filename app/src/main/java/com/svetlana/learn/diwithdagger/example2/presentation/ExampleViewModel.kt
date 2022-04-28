package com.svetlana.learn.diwithdagger.example2.presentation

import androidx.lifecycle.ViewModel
import com.svetlana.learn.diwithdagger.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModel()
{

    fun method() {
        useCase()
    }
}