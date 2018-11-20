class ClassExample(var name: String, var age: Int) {
    var boolean2: Boolean = true

    var boolean: Boolean? = null



    fun paint() {
        println("WTF")
    }
    fun paint2() {
        println("WTF")
    }


    constructor(name: String,  surname: String,  age: Int): this(name,age){
    }

    fun printName() {
        println(name)
    }



}