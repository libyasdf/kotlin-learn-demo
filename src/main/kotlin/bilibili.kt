package main.kotlin

import java.lang.Exception
import java.math.BigInteger
import java.util.*
import kotlin.reflect.typeOf

val PI: Float = 3.14f

fun main(args: Array<String>) {
    var name = "zhangsan";
    val num3 = Math.sqrt(5.0)
    val num4 = Math.pow(2.0, 100.0)
    val name1 = "zhen";
    // equals means == ; true means 忽略字母大小写
    val booleanVar = name.equals(name1, true)
    println(booleanVar)

//    test("10")
//    learnLoop()
//    sameWithFun()
    // 具名参数
//    println("半径：${defaultValueAnd(d = 3)}")

//    println("阶乘：${fact(BigInteger("10"))}")
    println("尾递归优化：${addLoop(10,0)}")
}


fun test(num: String?) {
// ? 代表可以为null
    when (num) {
        "10" -> println("${num}")
        else -> println("else")
    }

//    1..100
//    1 until 100
//    a in arr1 step 2
    val arr1 = 1..100
    // 不改变本身的arr1
    arr1.reversed()
    println(arr1 is IntRange)
//        总数
    arr1.count()
    for (num in arr1) {
        println(num)
    }
}

fun learnLoop() {
    val lists = listOf("ice", "fire", "spring")

    for ((i, e) in lists.withIndex()) {
        println("$i: $e")
    }

    val maps = TreeMap<String, String>()

    maps["nice"] = "happy"
    maps["me"] = "GOD"

    println(maps["me"])
}

fun sameWithFun() {
    // this part same as add()
    val i = { x: Int, y: Int -> x + y }
    val j: (Int, Int) -> Int = { x, y -> x + y }

    var a = i(1, 2)
    var b = j(3, 4)
    println("a = $a \nb = $b")
}

fun add(x: Int, y: Int) = x + y

fun defaultValueAnd(r: Float = PI, d: Int): Float {
    var a = readLine()
    var b = 13

    try {
        // 绝对不为null
        b = a!!.toInt()
        a = b.toString()
        println("输入的数字： $a")
    } catch (err: Exception) {
        println("catch it!!")
    }

    return r * d
}


fun fact(a: BigInteger): BigInteger {
    // 阶乘
    if (a == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return a * fact(a - BigInteger.ONE)
    }
}

// 尾递归 - stackover
tailrec fun addLoop(x: Int, result: Int): Int {
    println("result: ${result}")

    if (x == 0) {
        return 1
    } else {
        return addLoop(x - 1, result + x)
    }
}