package main.inherit

class Tianjian(name:String) :Human(name = "") {
    override fun eat() {
        println("eat lunch")
    }

    override fun pee() {
        println("WC")
    }
}