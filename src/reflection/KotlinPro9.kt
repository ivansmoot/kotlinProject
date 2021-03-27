package reflection

import kotlin.reflect.jvm.javaField

class KotlinPro9 {
    var name1: String = "ivan"
    var price = 100.1
}

var fname = "smoot"

fun main() {
    val topProp = ::fname
    topProp.set("Smoot")
    print(topProp.javaField)
    println(topProp.get())
    println(fname)

    val Kp9 = KotlinPro9()
    var mname = KotlinPro9::name1
    println(mname.name)
    mname.set(Kp9, "setit!")
    println(mname.get(Kp9))
}
