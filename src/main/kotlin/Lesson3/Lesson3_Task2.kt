package org.example.Lesson3

fun task2() {
    var firstName = "Татьяна "
    var secondName = "Андреева "
    var thirdName = "Сергеевна"
//        "Андреева Татьяна Сергеевна"
    var age = 20
    println("ФИО: ${secondName + firstName + thirdName}, Возраст: $age")
    secondName = "Сидорова "
    age = 22
    println("ФИО: ${secondName + firstName + thirdName}, Возраст: $age")
}

fun main() {
    task2()
}