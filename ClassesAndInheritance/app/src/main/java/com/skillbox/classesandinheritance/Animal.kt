package com.skillbox.classesandinheritance

import kotlin.random.Random

abstract class Animal constructor(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
): AgedAnimal(maxAge) {
    var energy: Int
        private set
    var weight: Int
        private set
    var age: Int
        private set
    val name: String

    init {
        this.energy = energy
        this.weight = weight
        this.age = 0
        this.name = name
    }

    val isTooOld: Boolean
        get() {
            return this.age >= this.maxAge
        }

    fun sleep() {
        if ((this.age + 1) <= this.maxAge) {
            this.energy += 5
            this.age++

            println("${this.name} спит")
        }
    }

    fun eat() {
        if ((this.age + 1) <= this.maxAge) {
            this.energy += 3
            this.weight++

            incrementAgeSometimes()

            println("${this.name} ест")
        }
    }

    open fun move() {
        if ((this.weight - 1) >= 0 && (this.energy - 5) >= 0 && (this.age + 1) <= this.maxAge) {
            this.energy -= 5
            this.weight--

            incrementAgeSometimes()

            println("${this.name} двигается")
        }
    }

     open fun makeChild(): Animal {
         val energy = Random.nextInt(10) + 1
         val weight = Random.nextInt(5) + 1

         val child = object: Animal(energy, weight, this@Animal.maxAge, name) {}

         println("Родилось животное! Энергия: ${child.energy}, вес: ${child.weight}, максимальный возраст: ${child.maxAge}, имя: ${child.name}")

         return child
    }

    private fun incrementAgeSometimes() {
        if (Random.nextBoolean()) {
            this.age ++
        }
    }
}