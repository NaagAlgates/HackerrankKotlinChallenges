package com.iamnagaraj.kotlin.challenges.hackerrank

import java.util.*
import kotlin.math.abs

fun catAndMouse(a: Int, b: Int, c: Int): String {

    val catA = abs(c-a)
    val catB = abs(c-b)
    return if(catA == catB) "Mouse C" else if (catA > catB) "Cat B" else "Cat A"

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}