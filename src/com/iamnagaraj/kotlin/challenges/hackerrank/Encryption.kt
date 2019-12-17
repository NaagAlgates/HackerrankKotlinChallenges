package com.iamnagaraj.kotlin.challenges.hackerrank

import kotlin.math.floor
import kotlin.math.ceil
import kotlin.math.sqrt


fun main() {
    val sentence = readLine()!!.replace("\\s".toRegex(), "")
    val len = sqrt(sentence.length.toDouble())
    val min = floor(len).toInt()
    val max = ceil(len).toInt()
    val rows = if (min * max >= sentence.length) min else max

    for (col in 0 until max) {
        for (row in 0 until rows) {
            val idx = row * max + col
            if (idx < sentence.length) print(sentence[idx])
        }
        print(' ')
    }
}