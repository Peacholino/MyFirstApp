package com.example.myfirstapp.models

open class Dice {
    open val sides = 6
    fun roll() : Int {
        val nextNumber = kotlin.random.Random.nextInt(sides) + 1               //value that generates a random Int
        return nextNumber
    }
}