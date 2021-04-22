package main.inherit

class MenI : Human(name = ""), IMane {
    override fun xiaodidi() {
        println("18 CM")
    }

    override fun eat() {
        println("本质是人")
    }

    override fun pee() {
        println("本质是人")
    }

}