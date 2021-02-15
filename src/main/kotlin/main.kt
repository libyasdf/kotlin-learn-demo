fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

public fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}

fun main(args: Array<String>) {
    val itemss = listOf("apple", "banana", "kiwi")
    for (item in itemss) {
        println(item)
    }

    for (index in itemss.indices) {
        println("item at $index is ${itemss[index]}")
    }

    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }

    println("what you rname?")
    var name = readLine();
    println("Hello world $name");

    for (i in 4 downTo 1){
        println("i $i"); // 4 3 2 1
    }

    for (i in 1..4 step 2){
        println("j $i") // 1 3
    }

    val text = """
    多行字符串
    多行字符串
    """
    val text2 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text);
    println(text2);

    //[1,2,3]
    val aA = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(aA[0])    // 输出结果：1
    println(b[1])    // 输出结果：2

    var a = 1
    // 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3

    vars(1,2,3,4,5)  // 输出12345

    //类型后面加?表示可为空
    var age: String? = "23"
    //抛出空指针异常
    val ages = age!!.toInt()
    //不做处理返回 null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1

    val boxA : Int? = 1;

}