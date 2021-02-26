package deconstruction

// 注解 annotation
// 元注解 meta-annotation:对注解的注解

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.CLASS,
    AnnotationTarget.PROPERTY_SETTER
)
@MustBeDocumented
annotation class MyAnnotation


@MyAnnotation
class MyClass @MyAnnotation constructor(){
    @MyAnnotation
    fun myFunction(): Int{
        return (@MyAnnotation 10)
    }

    var a: Int? = null
        @MyAnnotation set
}
