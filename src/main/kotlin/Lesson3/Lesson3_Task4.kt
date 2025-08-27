package org.example.Lesson3

fun task4() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1
    println("[$from-$to;$moveNumber]")
    from = "D2"
    to = "D3"
    moveNumber++
    println("[$from-$to;$moveNumber]")
}

fun main() {
    task4()
}