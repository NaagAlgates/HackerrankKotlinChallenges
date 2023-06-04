package com.iamnagaraj.kotlin.challenges.hackerrank

fun main() {
    val (n, m) = readln().split(' ').map(String::toInt)
    val subjectListByTeam = List(n) {
        readln().take(m)
    }
    var highestTeamKnowledge = 0
    var teamCount = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val currentTeamKnowledge =
                (subjectListByTeam[i] zip subjectListByTeam[j]).count { it.first == '1' || it.second == '1' }
            if (currentTeamKnowledge > highestTeamKnowledge) {
                highestTeamKnowledge = currentTeamKnowledge
                teamCount = 1
            } else if (currentTeamKnowledge == highestTeamKnowledge) {
                teamCount++
            }
        }
    }
    println(highestTeamKnowledge)
    println(teamCount)
}
