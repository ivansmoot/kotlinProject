package kotlin1

class OuterClass3 {

    class NestedClass {
        init {
            println("NestedClass: init")
        }
    }

}

class OuterClass4 {

    inner class InnerClass(str: String) {
        init {
            println(str)
        }
    }

}

fun main() {
    val nestedClass3 = OuterClass3.NestedClass()

    val nestedClass4 = OuterClass4().InnerClass("yellow")
}