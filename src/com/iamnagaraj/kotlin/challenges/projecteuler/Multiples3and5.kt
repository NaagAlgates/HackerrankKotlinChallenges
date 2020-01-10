package com.iamnagaraj.kotlin.challenges.projecteuler


fun main() {
    val t: Int = try {
        readLine()!!.toInt()
    } catch (e: Exception) {
        0
    }
    var result: Long = 0
    repeat(t) {
        val n: Long = try {
            readLine()!!.toLong() - 1
        } catch (e: Exception) {
            0
        }
        val three = 3 * (n / 3 * ((n / 3) + 1)) / 2
        val five = 5 * (n / 5 * ((n / 5) + 1)) / 2
        val fifteen = 15 * (n / 15 * ((n / 15) + 1)) / 2
        println(three + five - fifteen)
    }
}