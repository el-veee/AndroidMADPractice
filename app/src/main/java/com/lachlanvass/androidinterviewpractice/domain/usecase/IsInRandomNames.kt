package com.lachlanvass.androidinterviewpractice.domain.usecase

import com.lachlanvass.androidinterviewpractice.domain.repository.GetNamesRepository

class IsInRandomNames(private val repository: GetNamesRepository) {

    operator fun invoke(name: String): Boolean {
        return repository.isInNames(name)
    }
}