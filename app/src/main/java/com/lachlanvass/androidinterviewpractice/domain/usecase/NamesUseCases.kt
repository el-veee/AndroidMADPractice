package com.lachlanvass.androidinterviewpractice.domain.usecase

data class NamesUseCases(
    val getName: GetName,
    val getAllNames: GetAllNames,
    val isInRandomNames: IsInRandomNames
)
