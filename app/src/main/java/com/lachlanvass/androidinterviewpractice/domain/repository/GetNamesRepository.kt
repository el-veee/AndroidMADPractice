package com.lachlanvass.androidinterviewpractice.domain.repository

interface GetNamesRepository {

    fun getRandomName(): String
    fun getAllNames(): Set<String>
    fun isInNames(name: String): Boolean

}