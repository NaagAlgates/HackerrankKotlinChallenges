package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    //readLine()
    val userScores = readLine()!!.split(" ").map { it.toInt() }.distinct()
    //readLine()
    val aliceScores = readLine()!!.split(" ").map { it.toInt() }
    //println(userScores)
    //println(aliceScores)
    //println(userScores.keys)
    aliceScores.forEach { aliceScore->
        //println(userScores.keys.filter { it>aliceScore })
        println("${userScores.filter { it>aliceScore }.count()+1}")
    }
    /*aliceScores
        .map { userScores.binarySearch(it, Comparator { o1, o2 -> if (o1 < o2) 1 else if (o1 == o2) 0 else -1 }) }
        .forEach { println(if (it >= 0) it + 1 else -it) }*/

    /*fun Int.absolute(): Int {
        return if (this < 0) {
            this * -1
        } else {
            this
        }
    }
    aliceScores.forEach { alice ->
        val rank = userScores.binarySearch { alice-it }
        //println(alice)
        //println(userScores.binarySearch{it})
        //println(rank)
        if(rank<0){
            println(rank.absolute())
        }else{
            println(rank.plus(1))
        }
    }*/
}