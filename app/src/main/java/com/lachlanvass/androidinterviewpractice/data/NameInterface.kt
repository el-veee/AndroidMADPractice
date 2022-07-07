package com.lachlanvass.androidinterviewpractice.data

interface NameInterface {

    val Names: Set<String>

    fun getName(): String
    fun getAllNames(): Set<String>
    fun isInNames(name: String): Boolean
}
