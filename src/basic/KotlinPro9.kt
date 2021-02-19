package basic

class MyClass {

    // 一定要是private的，其他的不行
    private var myObject = object {
        fun output() {
            println("output invoked")
        }
    }

    fun myTest() {
        myObject.output()
    }

}

class MyClass2 {

    private fun myMethod1() = object {
        val str = "hello"
    }

    internal fun myMethod2() = object {
        val str = "world"
    }

    fun myTest2() {
        println(myMethod1().str)
        println(myMethod2())
    }

}

fun main() {
    val myClass = MyClass()
    myClass.myTest()

    val myClass2 = MyClass2()
    myClass2.myTest2()
}