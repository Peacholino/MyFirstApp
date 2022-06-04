package com.example.myfirstapp.models

class Dice {
    fun roll() : Int {
        val nextNumber = kotlin.random.Random.nextInt(6) + 1               //value that generates a random Int
        return nextNumber
    }
}