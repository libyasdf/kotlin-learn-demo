package main.enum

enum class Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

fun main(args: Array<String>) {
    println("${Week.Monday} is ${Week.Monday.ordinal}")
}