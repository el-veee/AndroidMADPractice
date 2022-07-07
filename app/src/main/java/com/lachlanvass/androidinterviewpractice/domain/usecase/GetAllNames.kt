package com.lachlanvass.androidinterviewpractice.domain.usecase

import com.lachlanvass.androidinterviewpractice.domain.repository.GetNamesRepository

class GetAllNames(private val repository: GetNamesRepository) {

    operator fun invoke(): Set<String> {
        return repository.getAllNames()
    }
}