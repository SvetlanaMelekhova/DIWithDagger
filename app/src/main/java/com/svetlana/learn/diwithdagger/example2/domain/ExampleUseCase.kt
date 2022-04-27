package com.svetlana.learn.diwithdagger.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke(){
        repository.method()
    }
}