package funcAndLambda

// multiply的类型是 (Int, Int) -> Int ,代表接受两个Int参数,返回一个Int参数
val multiply: (Int, Int) -> Int = {a, b -> a * b}
// 推断返回类型
var add = {a:Int, b:Int -> a + b}

// 高阶函数:接收另一个函数作为参数,或将函数作为返回值
fun myCalculate(a: Int, b:Int, calculate: (Int, Int) -> Int): Int{
    return calculate(a, b)
}

fun main() {
    println(multiply(5,6))
    println(add(3,4))
    val myCalculate = myCalculate(2, 3) { a, b -> a + b }
    println(myCalculate)
}