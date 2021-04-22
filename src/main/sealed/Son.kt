package main.sealed

/*
 * sealed 只能有指定/特定个数的类型
 * 子类类型有限的class
 * sealed 更在意类型
 * 枚举更在意数据
 */
sealed class Son {
    fun sayHello(){
        println("hello")
    }
    class lv():Son()
    class luo:Son()
}

fun main(){
    var s1:Son = Son.lv()
    var s2:Son = Son.luo()
    var s3:Son = Son.lv()

    var sonList = listOf<Son>(s1,s2,s3)

    for (s in sonList){
        if (s is Son.luo) println("${s.sayHello()}")
    }
}