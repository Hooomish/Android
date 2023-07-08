package com.skillbox.loops_recursion_nullabletypes

fun main() {
    print("Введите количество чисел: ");
    val countOfNumbers = readln().toIntOrNull() ?: return;

    var arrayOfNumbers = getArray(countOfNumbers)
    printPositiveNumbers(arrayOfNumbers)

    val sumOfNumbers = sumOfNumbers(arrayOfNumbers)
    println("Сумма чисел: $sumOfNumbers")

    print("Введите число: ")
    val numberForNod = readln().toIntOrNull() ?: return

    println("НОД чисел $numberForNod и $sumOfNumbers ${nod(numberForNod, sumOfNumbers)}")
}

fun getArray(countOfNumbers: Int) : Array<Int> {
    var arrayOfNumbers = emptyArray<Int>();

    for (n in 1..countOfNumbers) {
        var number: Int? = null

        while(number == null) {
            print("$n. Введите число: ");
            number = readln().toIntOrNull();
        }

        if (number != null) {
            arrayOfNumbers += number;
        }
    }

    return arrayOfNumbers
}

fun printPositiveNumbers(array: Array<Int>) {
    print("Положительные числа: ")

    for (n in 0..array.size-1){
        if (array[n] > 0)
            print("${array[n]} ")
    }
    println("")
}

fun sumOfNumbers(array: Array<Int>): Int {
    var sum = 0

    for (n in 0..array.size-1){
        sum += array[n]
    }

    return sum
}

tailrec fun nod(firstNumber: Int, secondNumber: Int): Int {
    if (secondNumber == 0)
        return firstNumber;
    return nod(secondNumber, firstNumber % secondNumber);
}