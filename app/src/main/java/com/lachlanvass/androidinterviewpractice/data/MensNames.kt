package com.lachlanvass.androidinterviewpractice.data

class MensNames() : NameDataSource {

    override val names: Set<String>
        get() = setOf("Max", "Michael", "John")

//    override fun getName(): String {
//        return this.Names.random()
//    }
//
//    override fun getAllNames(): Set<String> {
//        return this.Names
//    }
//
//    override fun isInNames(name: String): Boolean {
//        return name in this.Names
//    }

}