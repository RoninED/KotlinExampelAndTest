open abstract class AbstractExample {
    open var b = 0
    var d = 0

    fun a() {
        println(b++)
    }

    abstract fun c()
}