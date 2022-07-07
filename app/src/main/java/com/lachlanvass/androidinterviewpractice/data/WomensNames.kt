package com.lachlanvass.androidinterviewpractice.data

class WomensNames: NameDataSource {

    override val names: Set<String>
        get() = setOf("Mulan", "Elsa", "Anna")
}