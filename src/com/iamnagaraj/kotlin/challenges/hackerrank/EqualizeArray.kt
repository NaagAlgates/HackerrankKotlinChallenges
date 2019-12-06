package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }
    println(values.size - values.groupingBy { it }.eachCount().map { it.value }.max()!!)
}