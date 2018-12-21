open class ExtendClassExample1 {        //Модификатор опен что бы можно было его наследовать

    open var WTF_string: String ="WTF1"     //для переопределения функции и свойства должны быть модификатор опэн

    fun Hi (){
        println("Hi, in fun from parent class $WTF_string")
    }
}