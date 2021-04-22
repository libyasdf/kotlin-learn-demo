package main.inherit

/*
 * 继承 多态 抽象 接口
 */
fun main(){
    // 继承
//    val son1 = Son()
//    println("${son1.personal}")
//    println("${son1.action()}")
    //多态
    val men1 = Men("liby1")
    val men2 = Men("liby2")
    val men3 = Men("liby3")
    val men4 = Men("liby4")
//    println("${men1.name} is that ${men1.eat()} and ${men1.pee()}")

    // 集合
    var arrPerson = listOf<Human>(men1,men2,men3,men4)

    // abstract
    for (item in arrPerson){
        println("抽象类是事物的本质 ${item.pee()}")
    }

    // interface
    var manL = MenI()
    println("interface 是事物的能力 ${manL.xiaodidi()}")

    val Tianjian1 = Tianjian("魏忠贤")
    println("${Tianjian1.name} ${Tianjian1.eat()}and ${Tianjian1.pee()}")

    val humanList = listOf<Human>(manL,Tianjian1)
    for (p in humanList){
        if (p is MenI){
            p.xiaodidi()
        }
    }

}