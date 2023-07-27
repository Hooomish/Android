package com.skillbox.classesandinheritance

class Zoo {
    var animals = mutableListOf(
        Bird(5, 5, 5, "Птица 1"),
        Bird(6, 6, 6, "Птица 2"),
        Bird(7, 7, 7, "Птица 3"),
        Bird(8, 8, 8, "Птица 4"),
        Bird(9, 9, 9, "Птица 5"),
        Fish(1, 1, 1, "Рыба 1"),
        Fish(2, 2, 2, "Рыба 2"),
        Fish(3, 3, 3, "Рыба 3"),
        Dog(5, 5, 5, "Собака 1"),
        Dog(10, 10, 10, "Собака 2"),
        object: Animal(3, 3, 3, "Животное 1"){},
        object: Animal(4, 4, 4, "Животное 2"){})

}