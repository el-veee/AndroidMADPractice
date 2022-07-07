package com.lachlanvass.androidinterviewpractice.domain.usecase

import com.lachlanvass.androidinterviewpractice.domain.repository.GetNamesRepository

class GetName(private val repository: GetNamesRepository) {

    operator fun invoke(): String {
        return repository.getRandomName()
    }
}