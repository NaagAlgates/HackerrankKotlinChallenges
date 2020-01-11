package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    readLine()!!
    val sequence = readLine()!!.split(" ").map { it.toInt() }
    (1..sequence.size).forEach {
        println(sequence.indexOf(sequence.indexOf(it) + 1) + 1)
    }
}
