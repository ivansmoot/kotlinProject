package kotlin1

// 对象表达式
// Java匿名内部类

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main() {

    val myObject = object: MyInterface {
        override fun myPrint(i: Int) {
            println("i:$i")
        }
    }

    val myObject2 = object {
        init {
            println("myObject2: init")
        }
        fun myMethod() = "myObject2: myMethod"
    }

    val myObject3 = object: MyInterface, MyAbstractClass() {
        override fun myPrint(i: Int) {
            println("i:$i")
        }

        override val age: Int
            get() = 30

        override fun printMyAbstractClassInfo() {
            println("printMyAbstractClassInfo invoked")
        }

    }

    myObject.myPrint(100)

    println(myObject2.myMethod())

    myObject3.myPrint(200)
    println(myObject3.age)
    myObject3.printMyAbstractClassInfo()

}