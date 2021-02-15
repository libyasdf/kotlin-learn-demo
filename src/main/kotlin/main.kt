fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

public fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

fun main(args: Array<String>) {
    println("what you rname?")
    var name = readLine();
    println("Hello world $name");

    for (i in 4 downTo 1){
        println("i $i"); // 4 3 2 1
    }

    for (i in 1..4 step 2){
        println("j $i") // 1 3
    }

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