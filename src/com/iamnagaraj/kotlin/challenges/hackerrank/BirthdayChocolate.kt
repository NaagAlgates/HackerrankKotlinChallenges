package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }
    val dm = readLine()!!.split(" ").map { it.toInt() }
    val d = dm[0]
    val m = dm[1]
    var count = 0
    var sum = 0

    /*for(i in 0 until values.size){
        sum = 0
        if(i+m<=values.size){
            for(j in i until i+m){
                sum += values[j]
            }
            if(sum==d) count++
        }
    }
    print(count)*/
    println((0..values.size - m)
        .map { i ->
            (0 until m).sumBy { values[i + it] }
        }.count { it == d })
}