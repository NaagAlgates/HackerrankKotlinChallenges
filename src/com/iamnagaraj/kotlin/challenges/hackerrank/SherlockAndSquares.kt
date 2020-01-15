package com.iamnagaraj.kotlin.challenges.hackerrank

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    repeat(readLine()!!.toInt()) {
        val (from, to) = readLine()!!.split(" ").map { it.toInt() }
        println((floor(sqrt(to.toDouble()))- ceil(sqrt(from.toDouble())) +1).toInt())
    }
}