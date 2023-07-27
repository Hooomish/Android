package com.skillbox.classesandinheritance

class Bird(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
): Animal(energy, weight, maxAge, name), Soundable {
    override fun move() {
        super.move()
        println("$name летит")
    }

    override fun makeChild(): Animal {
        val animalChild = super.makeChild()

        return Bird(animalChild.energy, animalChild.weight, animalChild.maxAge, animalChild.name)
    }

    override fun makeSound() {
        println("$name Тиу-тиу")
    }
}