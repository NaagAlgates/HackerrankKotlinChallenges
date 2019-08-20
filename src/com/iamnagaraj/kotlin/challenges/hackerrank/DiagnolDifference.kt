package com.iamnagaraj.kotlin.challenges.hackerrank

import kotlin.math.abs

fun main() {
    val matrixSize = readLine()!!.toInt()
    val matrix = (1..matrixSize).map { readLine()!!.split(" ").map { it.toInt() } }
    print(abs(matrix.indices.sumBy { matrix[it][it] - matrix[it][matrixSize-it-1] }))
}