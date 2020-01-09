package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    repeat(readLine()!!.toInt()) {
        val (n, m, s) = readLine()!!.split(" ").map { it.toInt() }
        val id = (s+(m-1))%n
        println(if(id==0) n else id)
    }
}