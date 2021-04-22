package main.func

// 高阶函数
var print = fun(name: String){
    println("$name")
}

fun main(args: Array<String>){
    val arr = listOf<String>("tom","jerry","lucy")
    arr.forEach(print)
    // same as
    arr.forEach {
        a -> println("$a")
    }
    // same as
    arr.forEach {
        // 闭包
        println(it)
    }
}