package com.skillbox.classesandinheritance

class Dog(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
): Animal(energy, weight, maxAge, name), Soundable {
    override fun move() {
        super.move()
        println("$name бежит")
    }

    override fun makeChild(): Animal {
        val animalChild = super.makeChild()

        return Dog(animalChild.energy, animalChild.weight, animalChild.maxAge, animalChild.name)
    }

    override fun makeSound() {
        println("$name Гав-гав")
    }
}