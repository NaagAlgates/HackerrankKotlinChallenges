package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val (n, k) = readLine()?.split(" ")?.map { it.toInt() }!!
    val clouds = readLine()?.split(" ")?.map { it.toInt() }!!

    var e = 100
    var i = 0
    do {
        i = (i+k) % n
        e--
        if (clouds[i] == 1) e-=2
    } while (i != 0)

    println(e)
}