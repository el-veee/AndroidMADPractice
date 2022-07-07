package com.lachlanvass.androidinterviewpractice.data

import com.lachlanvass.androidinterviewpractice.domain.repository.GetNamesRepository

class GetNamesRepositoryImpl(namesData: NameDataSource):GetNamesRepository {
    override fun getRandomName(): String {
        TODO("Not yet implemented")
    }

    override fun getAllNames(): Set<String> {
        TODO("Not yet implemented")
    }

    override fun isInNames(name: String): Boolean {
        TODO("Not yet implemented")
    }

}