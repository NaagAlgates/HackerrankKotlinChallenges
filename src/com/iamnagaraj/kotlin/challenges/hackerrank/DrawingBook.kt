package com.iamnagaraj.kotlin.challenges.hackerrank

import java.util.*
import kotlin.math.min

fun pageCount(n: Int, p: Int): Int {
    val totalPageTurnCountFromFront = n / 2
    val targetPageTurnCountFromFront = p / 2
    val targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront

    return min(targetPageTurnCountFromFront, targetPageTurnCountFromBack)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}