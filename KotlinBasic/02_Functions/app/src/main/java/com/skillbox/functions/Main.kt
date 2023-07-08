package com.skillbox.functions
import kotlin.math.sqrt

fun main() {
    solveEquation(3, -14, -5)
    solveEquation(4, -7, 0)
    solveEquation(3, 6, 3)
}

fun solveEquation (a: Int, b: Int, c: Int) :Double? {
    if (a==0){
        println("\na=0")
        return null;
    }

    println("\n$a*x^2 + $b*x + $c = 0")

    val discriminant = b*b - 4*a*c //discriminant calculation
    var solutionSum = 0.0

    if (discriminant == 0) {
        val x = -1 * (b/(2*a)); //x calculation for D=0

        solutionSum = x.toDouble();
        println("x = $solutionSum");

        return solutionSum;
    } else if (discriminant > 0) {
        val discriminantSqrt = sqrt(discriminant.toDouble());

        val x1 = ((-1*b) + discriminantSqrt) / (2*a); //x calculation for D>0
        val x2 = ((-1*b) - discriminantSqrt) / (2*a);

        solutionSum = x1+x2;
        println("x1+x2 = $solutionSum");

        return solutionSum;
    } else { //x calculation for D<0
        println("Discriminant < 0");
        return null;
    }
}