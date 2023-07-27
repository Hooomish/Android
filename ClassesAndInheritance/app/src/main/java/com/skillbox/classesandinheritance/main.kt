package com.skillbox.classesandinheritance

import kotlin.random.Random

fun main() {
    //9
    //var bird = Bird(5, 5, 10, "Птица")
    //lifeProcessOfOneAnimal(bird)

    //19
    simulateLifeInZoo(5)
}

fun lifeProcessOfOneAnimal(animal: Animal) {
    var currentAnimal = animal

    while (true) {
        currentAnimal.eat()
        currentAnimal.move()
        currentAnimal.sleep()

        if (currentAnimal.isTooOld){
            currentAnimal = animal.makeChild()
        }
    }
}

fun simulateLifeInZoo(numberOfIterations: Int) {
    val zoo = Zoo()

    for (i in 1..numberOfIterations) {
        val children: MutableList<Animal> = mutableListOf()

        zoo.animals.forEach{
            val newAnimal = randomAnimalAction(it)

            if(newAnimal != null){
                children.add(newAnimal)
            }
        }

        if (children.size != 0) {
            children.forEach{zoo.animals.add(it)}
        }

        zoo.animals.removeIf{it.isTooOld}

        val zooSize = zoo.animals.size
        println("Количество животных: $zooSize")

        if (zooSize == 0) {
            println("В зоопарке больше нет животных")
            break
        }
    }
}

fun randomAnimalAction(animal: Animal) :Animal? {
    val randomValue = Random.nextInt(5) + 1
    var child: Animal? = null

    when(randomValue) {
        1 -> animal.sleep()
        2 -> animal.eat()
        3 -> animal.move()
        4 -> if(animal is Soundable) animal.makeSound()
        5 -> child = animal.makeChild()
    }

    return child
}