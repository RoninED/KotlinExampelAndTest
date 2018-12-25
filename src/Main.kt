fun main(args: Array<String>) {
    ////Назначение переменных__________________________________________________________________________________________________

//    var name: String = "Ed"
//
//    var exampleAny: Any = "Hi"
//    exampleAny = 3
//    println("Пример типа Any ${exampleAny+1}")
//
//    var exampleAuto = 5
//    println("Автоопределение типа ${exampleAuto+1}")
//
//    var a: Int = 1
//    var b: Int = 2
//    println("Hello $name")
//    println("A + B = ${a+b}")

//------------------------------------------------------------

    ////NULL__________________________________________________________________________________________________

/*
Для присвоения null нужно после типа указать "?"
типы с "?" отдельный вид типов - нельзя просто int прировнять к int?
 */
//    var d: Int? = null


    /*
    Оператор !! (not-null assertion operator) принимает один операнд.
    Если операнд равен null, то генерируется исключение kotlin.KotlinNullPointerException.
    Если операнд не равен null, то возвращается его значение.
     */
//    val name : String?  = "John"
//    val id: String = name!! //если name будет null, то возникнет NullPointerException
//    println(id)

    //------------------------------------------------------------

    ////RANGE__________________________________________________________________________________________________
//    var b = 6
//    var a = 1..b step 2
//    var e = 1 until 10 //диапазон не включающий верхнюю планку
//    var c = 'a'..'e' //диапазон букв
//    var d = 10 downTo 5 //обратный диапазон
//    var isInRange = 5 in e // true если число в диапазоне "е"
//    var isInRange2 = 5 !in e // false если число в диапазоне "е"
//    for(c in 1..8 step 2) println(c)

    //------------------------------------------------------------

    ////CLASS__________________________________________________________________________________________________
//    var classExample = ClassExample("Fedor", 2)
//    classExample.printName()
//
//    classExample.paint()
//    println(classExample.boolean)
//    println(classExample.boolean2)
//    classExample.boolean2 =false
//    println(classExample.boolean2)
//
//    var classExampleSecondConstructor = ClassExample("Vasya", "Suslicov", 3) //пример со вторым конструктором
//    classExampleSecondConstructor.printName()
//
//    println(classExample.infoBoolean2) //пример с геттером
//
//    println(classExample.exampleGetSet) //пример работы геттер сеттера
//    classExample.exampleGetSet = "WTF"
//    println(classExample.exampleGetSet)
//------------------------------------------------------------a

    ////ENUM__________________________________________________________________________________________________
//    var enumExample = EnumExample()
//    enumExample.printAll()
//------------------------------------------------------------

    ////FUN__________________________________________________________________________________________________
//fun empty() {
//}

//    fun turboPushka(a: Long): Int {
//        return 1
//    }
//
//    fun oneLineFunction (a:Int) = a+2

    /*
    Функция может принимать переменное количество параметров одного типа. Для определения таких параметров применяется ключевое слово vararg.
     */
//    fun manyOneTypeParametres (vararg s: Any){
//        for (str in s){
//            println(str)
//        }
//    }
//    manyOneTypeParametres("hi", "by",4)


    /*
    Именный аргументы в функциях + параметр со значением по умолчанием (age)
     */
//fun gurrenLagann (name: String, surname: String, age:Int=19){
//        println(age)
//    }
//    gurrenLagann("noVasya", "Suslikov")
//    gurrenLagann(surname = "Suslikov", name = "Vasya", age = 20)


//    var hi = fun (): String{ //пример анонимной функции
//        return "hi анонимная функция"
//    }
//    println(hi())
//------------------------------------------------------------

    ////WHEN__________________________________________________________________________________________________
//    var N =7
//    var result = when(N) {
//        1, 2 -> "один или два "
//        3 -> "three"
//        4 -> "four"
//        5 -> "five"
//        in 6..10 -> "from six till ten"
//        else -> {
//            println("nothing")
//        }
//    }
//    println(result)
//
//    when {
//        (N==1) -> println("wtf")
//        (N==2) -> println("wtf2")
//        else -> println("what?")
//    }
//    println(result)
//------------------------------------------------------------

    ////INTERFACES__________________________________________________________________________________________________
//    var v1  = InterfaceExample2()
//    v1.fun2()
//    v1.fun1()
//------------------------------------------------------------

    ////ABSTRACT__________________________________________________________________________________________________
//    var a = AbstractExample2()
//    a.a()
//    println(a.b)
//    a.c()
//    println(a.b)
//------------------------------------------------------------

    ////WHILE__________________________________________________________________________________________________
//    var i =5
//    while (i<8){
//        println(i)
//        i++
//    }
//
//    i=3
//    do {
//        println("$i wtf")
//        i++
//    }
//        while (i<5)
//------------------------------------------------------------


    ////FOR__________________________________________________________________________________________________
//    var nums = 0..500
//    for(value in nums step 100){
//        println(" $value типа foreach со всякими свистелками перделками")
//    }
//------------------------------------------------------------


    ////IN__________________________________________________________________________________________________
//    var i = 1..10
//    println(2 in i)
//------------------------------------------------------------


    ////DATA CLASS__________________________________________________________________________________________________
//    var dataClassExample =DataClassExample("Jimmy")
//    println(dataClassExample)
//
//    dataClassExample.name ="Vasya"
//    println(dataClassExample)
//
//    var dataClassExample2 = dataClassExample.copy("Vasya2")
//    println(dataClassExample2)
//------------------------------------------------------------


    ////IS__________________________________________________________________________________________________
//    val a: Int =5
//    if (a is Int) println("a is Int")
//------------------------------------------------------------


    ////ARRAY__________________________________________________________________________________________________
//    val arr: Array<Int> = arrayOf(1, 2, 3)
//    var a: Int = arr[0]
//    arr[2] = 0
//    println("arr1 = ${a + arr[1]}")
//
//    /*
//    Альтернативный конструктор массива с двумя входящими параметрами
//    (кол-во элементов, {выражение для генерации элементов})
//     */
//    val arr2 = Array(3, { 5 })
//    println("arr2 = ${arr2[0]}, ${arr2[1]}, ${arr2[2]}")
//
//    /*
//    Массивы под определеные типы:
//     */
//    val arr3: CharArray = charArrayOf('a', 'b' , 'c')
//    println("arr3 = ${arr3[0]}, ${arr3[1]}, ${arr3[2]}")
//
//    /*
//    Двухмерный массив
//     */
//    var arr4: Array <Array<Int>> = Array(2) { Array(2) {0} }
//    arr4 [0] = arrayOf(1, 2)
//    arr4 [1] = arrayOf(2, 3)
//
//    var arr5: Array <Array<Int>> = arrayOf(arrayOf(8,2), arrayOf(1,2,3,4))
//    println("arr5 = ${arr5[1][0]}")
//
//    /*
//    Перебор массива
//     */
//    var arr6: IntArray = intArrayOf(4,3,2,1)
//    for (counts in arr6){
//        println("arr6 = $counts")
//    }

//------------------------------------------------------------


////BREAK__________________________________________________________________________________________________
//    var a: Int = 0
//
//    breaktest@ while (a < 5) {
//        a++
//        println(a)
//        if (a == 3) break@breaktest
//    }
//------------------------------------------------------------

////CONTINUE__________________________________________________________________________________________________
//    var a: Int = 1
//
//    CONTINUETEST@ while (a>0){
//
//        a--
//        println(a)
//        while (a < 5) {
//            a++
//            println(a)
//            if (a == 3) continue@CONTINUETEST
//        }
//    }

//------------------------------------------------------------

////LAMBDA__________________________________________________________________________________________________

//
//
//    val hello2 = {println("hello2")}
//    hello2()
//
//
//    run({ println("hello3")})
//
//
//    var hello4 = {hello41: Int, hello42: Int  ->
//        var result: Int = hello41 + hello42
//        println("hello$result")
//    result  //последняя строка возвращается как результат лямбда выражения
//    }
//    hello4(1,3)
//
//
//    var hello5 = {a: Int, b: Int -> a+b}
//    println("hello${hello5(1,3) + 1}")
//
//
//    val hello6: (String) -> Unit = {message: String -> println("hello6")}   //пример как принудительно указать тип возвращаемого значения "Unit"
//
//
//    var hello7 = {a:Int, b:Int -> a+b}  //использование лямбда функции как параметр метода
//    fun hello7Fun (lamdaFun: (a:Int, b:Int) -> Int){
//        println("hello${lamdaFun(4,3)}")
//    }
//    hello7Fun(hello7)
//
//
//    fun hello8Fun (): (a: Int, b:Int) -> Int {  //возврат функции из метода
//        return {a: Int, b: Int -> a+b}}
//    var hello8 = hello8Fun()
//    println("hello${hello8(4,4)}")

//------------------------------------------------------------

////EXTENDCLASS__________________________________________________________________________________________________
//    var extendClassExample2: ExtendClassExample2 = ExtendClassExample2()
//    extendClassExample2.Hi()



    //------------------------------------------------------------

    ////ПРЕОБРАЗОВАНИЕ ТИПОВ__________________________________________________________________________________________________
//    val a1: String = "1"
//    val a2: Int = a1.toInt()
//    println("${a2+1} - преоброзование toInt из стринга")
//
//    val c1: Any = 1
//    var c2 = c1 as Int
//    println("${c2+1} - преоброзование as Int (из стринга не получается - из класса Any плучилось)")
//
//    var b1:Any = 1
//    if (b1 is Int) println("b1 is int")     //проверка что b1 является интом
//
//    val name : String  = "Tom"
//    val id: Int? = name as? Int     //преобразование с nullable типом





//------------------------------------------------------------


}

