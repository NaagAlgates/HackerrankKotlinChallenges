package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val values = readLine()!!.split(" ").map { it.toInt() }
    /*val resultList = mutableListOf<Int>()
    var data =0
    for(i in 0 until values.max()!!+1){
        if(values.contains(i)){
            data = values.count{it==i}
            resultList.add(i,data)
        }else{
            resultList.add(i,data)
        }
        data =0
    }
    println(resultList.indexOf(resultList.max()!!))*/
    val group = values.groupBy { it }
    println(group.filter { it.value.size == group.maxBy { it.value.size }?.value?.size }.minBy { it.key }?.key)
}