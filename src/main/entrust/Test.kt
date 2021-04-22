package main.entrust

/*
 * 代理 委托 by
 */
fun main() {
    // 换成object后 后面的括号去掉
    val son1 = BigHeadSon
    // 将class换成object -  单例模式：只能有一个"儿子"
//    val son2 = BigHeadSon()
//    println(son1 == son2)
    println("${son1.washing()}")

    val father = SmallHeaderFather()
    println("${father.washing()}")


}