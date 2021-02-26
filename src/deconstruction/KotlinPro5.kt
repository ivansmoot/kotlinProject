@file:JvmName("helloKotlin")
// 指定生成字节码的文件名
package deconstruction

import kotlin.reflect.KClass

/*
    注解构造方法允许的参数类型：
    1.原生类型
    2.String
    3.class(MyClass::class)
    4.枚举
    5.其他注解
    6.1-5的数组
    注解参数不允许可空,JVM不支持存储空的注解属性值
 */

annotation class MyAnnotation2(val str: String)
annotation class MyAnnotation3(val str: String, val myAnnotation: MyAnnotation2)
annotation class MyAnnotation4(val arg1: KClass<*>, val agr2: KClass<out Any>)

@MyAnnotation2("hello")
class MyClass2

// 注解在参数中,不需要加@
@MyAnnotation3("hello", MyAnnotation2("world"))
class MyClass3

@MyAnnotation4(String::class, Int::class)
class MyClass4
