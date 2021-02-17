package kotlin1

class Person(val name: String, val age: Int) {

    private inner class PersonFeature(var height: Int, var weight: Int) {
        fun getPersonFeature() {
            println("height：$height, weight：$weight")
//            method()
            this@Person.method()
        }
    }

    private fun method() {
        println("Person: method")
    }

    fun getPerson() {
        val person = PersonFeature(180, 80)
        person.getPersonFeature()
    }

}

fun main() {
    val person = Person("ivan", 20)
    person.getPerson()
}