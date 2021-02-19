package basic

class Person2 {

    fun eat(){
        println("eating...")
    }

    fun sleep(){
        println("sleeping...")
    }
}

fun live(person: Person2?){
    person?.let {
        it.eat()
        it.sleep()
    }
}

fun main() {
    val person = Person2()
    live(null)
    live(person)
}