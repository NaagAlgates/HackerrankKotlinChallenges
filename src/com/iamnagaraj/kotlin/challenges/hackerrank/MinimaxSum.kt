package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }
    val sum = values.sum()
    println("${sum - values.max()!!} ${sum - values.min()!!}")
}