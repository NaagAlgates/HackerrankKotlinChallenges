package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }.sortedBy { it }
    val answer = mutableListOf<Int>()
    (values.indices).forEach {
        println(it)
        if(values.size > it+1){
            if(values[it] - values[it+1] <=1) answer.add(values[it])
        }
    }
    print(answer)
}