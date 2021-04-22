package main.entrust
// object 去掉（）
class SmallHeaderFather:WashBowl by BigHeadSon {
    override fun washing() {
        // 可以不override
        println("小头爸爸 8¥")
        // object 去掉（）
        BigHeadSon.washing()
        println("小头爸爸还剩 7¥")
    }
}