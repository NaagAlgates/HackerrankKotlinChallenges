package com.iamnagaraj.kotlin.challenges.hackerrank


import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun angryProfessor(k: Int, a: Array<Int>): String {
    return if(a.filter { it>=0 }.size<=k) "YES" else "NO"
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
