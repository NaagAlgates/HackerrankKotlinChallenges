package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val k = readLine()!!.split(" ").map { it.toInt() }
    val values = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    /*for(i in values.indices){
        if(i<values.size){
            for(j in i+1 until values.size){
                if((values[i]+values[j]) % k[1] == 0) count++
            }
        }
    }*/
    for(i in 0 .. values.size-2){
        repeat((i+1 until values.size)
            .asSequence()
            .filter { (values[i]+values[it]) % k[1]==0 }.count()
        ) { count++ }
    }
    println(count)
}