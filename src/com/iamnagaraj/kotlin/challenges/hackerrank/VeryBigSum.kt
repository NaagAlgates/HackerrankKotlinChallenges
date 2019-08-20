package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val a = readLine()!!.split(" ").map { it.toLong() }
    print(a.sum())
}