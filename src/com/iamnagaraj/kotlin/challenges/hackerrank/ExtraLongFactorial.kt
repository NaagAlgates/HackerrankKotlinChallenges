package com.iamnagaraj.kotlin.challenges.hackerrank

import java.math.BigInteger

fun main() {
    val n = readLine()!!.toInt()
    println(factorial(n))
}

fun factorial(num: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 2..num) result *= BigInteger.valueOf(i.toLong())
    return result
}