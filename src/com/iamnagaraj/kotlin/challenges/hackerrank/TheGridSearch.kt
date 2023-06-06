package com.iamnagaraj.kotlin.challenges.hackerrank
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (R, C) = readln().split(' ').map(String::toInt)
        val actualList = List(R) { readln() }

        val (r, c) = readln().split(' ').map(String::toInt)
        val toCompareList = List(r) { readln() }

        checkNotNull(R == actualList.size)

        var found = false

        outerLoop@ for (i in 0 until (R - r + 1)) {
            for (j in 0 until (C - c + 1)) {
                if (actualList[i].substring(j until (j + c)) == toCompareList[0] &&
                    (1 until r).all { k -> actualList[i + k].substring(j until (j + c)) == toCompareList[k] }) {
                    found = true
                    break@outerLoop
                }
            }
        }

        println(if (found) "YES" else "NO")
    }
}
