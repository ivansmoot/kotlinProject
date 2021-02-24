package funcAndLambda

import java.lang.StringBuilder
import java.util.function.Predicate

// 过滤字符串里所有的数字
// eg: input "abc12d3efg4" output "abcdefg"

//fun stringFilter(str: String): String{
//    val str2 = StringBuilder()
//    str.forEach {
//        if(!it.isDigit()){
//            str2.append(it.toString())
//        }
//    }
//    return str2.toString()
//}

fun String.filter(Predicate: (Char) -> Boolean): String{
    val sb = StringBuilder()
    for (index in 0 until length){
        if (Predicate(get(index))){
            sb.append(get(index))
        }
    }
    return sb.toString()
}

fun main() {
//    println(stringFilter("abc12d3efg4"))
    // 这种更灵活，规则由传入的时候确定
    println("abc12d3efg4".filter { it.isLetter() })
}