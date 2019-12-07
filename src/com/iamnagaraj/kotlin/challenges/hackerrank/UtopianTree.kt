package com.iamnagaraj.kotlin.challenges.hackerrank

import java.util.*
import kotlin.io.*
import kotlin.text.*

fun utopianTree(n: Int): Int {
    var grownCount = 0
    repeat((0..n).count()) {
        grownCount = if (grownCount % 2 != 0) {
            grownCount * 2
        } else {
            grownCount ++
        }
    }
    return grownCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}

