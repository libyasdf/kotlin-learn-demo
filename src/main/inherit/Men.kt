package main.inherit

class Men(name:String):Human(name) {
    override fun eat() {
        println("$name eat loud")
    }

    override fun pee() {
        println("$name Men stand up pee")
    }
}