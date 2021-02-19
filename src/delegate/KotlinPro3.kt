package delegate

// 延迟属性:第一次访问被计算，后面用计算缓存
 val myLazyValue: Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
     println("hello")
    30
}

fun main() {
    println(myLazyValue)
    println("---------")
    println(myLazyValue)
}