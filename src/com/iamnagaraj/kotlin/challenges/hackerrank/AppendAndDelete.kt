package com.iamnagaraj.kotlin.challenges.hackerrank

fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    val k = readLine()?.toInt()!!
    val minLength = minOf(s.length, t.length)
    val sameUpTo = (0 until minLength).firstOrNull { s[it] != t[it] } ?: minLength
    val diff = s.length + t.length - sameUpTo*2

    if (diff <= k && diff % 2 == k % 2 || s.length + t.length < k) {
        println("Yes")
    } else {
        println("No")
    }
}