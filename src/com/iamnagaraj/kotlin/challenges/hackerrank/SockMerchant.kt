package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    println(readLine()!!.split(" ").map { it.toInt() }.groupBy { it }.filter { it.value.size > 1 }.values.sumBy { it.size / 2 })
}