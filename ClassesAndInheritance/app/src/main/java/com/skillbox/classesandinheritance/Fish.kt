package com.skillbox.classesandinheritance

class Fish(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
): Animal(energy, weight, maxAge, name) {
    override fun move() {
        super.move()
        println("$name плывёт")
    }

    override fun makeChild(): Animal {
        val animalChild = super.makeChild()

        return Fish(animalChild.energy, animalChild.weight, animalChild.maxAge, animalChild.name)
    }
}