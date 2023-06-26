package com.skillbox.basicsyntax

fun main() {
    val firstName = "Nastassia"
    val lastName = "Zahnetava"
    var height = 168
    val weight = 60
    var isChild = height < 150 || weight < 40;

    var info = "$firstName $lastName, height: $height, weight: $weight, child: $isChild"

    println(info)

    height = 140

    println(info)
}