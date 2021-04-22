package main.kotlin

class DemoClass(var height: Int, var width: Int)

fun main() {
    var a = DemoClass(10, 20)
    println("高：${a.height}")
    println("宽：${a.width}")
}