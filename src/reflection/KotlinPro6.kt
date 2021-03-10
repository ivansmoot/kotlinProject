package reflection

// 引用特定对象的一个实例方法

fun main() {
    val str = "foo"
    val getReference = str::get
    println(getReference(1))

    val myProp = "bar"::length
    println(myProp.get())
    println(String::length.get(str))
}