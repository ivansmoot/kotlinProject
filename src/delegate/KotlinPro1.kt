package delegate

// 委托
// 类委托

interface MyInterface2{
    fun myPrint()
}

class MyInterfaceImpl(private val str: String): MyInterface2 {
    override fun myPrint() {
        println("welcome $str")
    }
}

// 委托构造方法的参数去实现myPrint方法
class MyClass3(myinterface: MyInterface2): MyInterface2 by myinterface

fun main() {
    val myinterfaceimpl = MyInterfaceImpl("hello")
    val myclass = MyClass3(myinterfaceimpl)
    myclass.myPrint()
}