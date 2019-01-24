class ClassExample(var name: String, var age: Int) {                              //первый конструктор

    val name_: String   //пример инициализации, хз зачем
    init {
        name_ = name
    }


    var boolean2: Boolean = true
    val a: Int = 1


    var boolean: Boolean? = null

    val infoBoolean2: String
        get() = "hello = $boolean2"

    var exampleGetSet: String? = null
        get() = "/geter добавил/ $field"
        set(value) {
            field = "/setter изменил /$value"   //field - это обращение к текущему полю
        }


    fun paint() {
        println("WTF")
    }

    fun paint2() {
        println("WTF")
    }


    constructor(name: String, surname: String, age: Int) : this(name, age) {     //второй конструктор
    }

    fun printName() {
        println(name)
    }


}


