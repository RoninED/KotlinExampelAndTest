import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {

//    var name: String = "Ed"
//
//    var a: Int = 1
//    var b: Int = 2
//    println("Hello $name")
//    println("A + B = ${a+b}")

//    val variables = Variables("Aaaaaa")
//    print(variables.A)

//    println(turboPushka(2))

///*
//Для присвоения null нужно после типа указать "?"
// */
//    var d: Int? = null

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
//    var classExampleSecondConstructor = ClassExample("Vasya", "Suslicov", 3)
//    classExampleSecondConstructor.printName()

//------------------------------------------------------------a

    ////ENUM__________________________________________________________________________________________________
//    var enumExample = EnumExample()
//    enumExample.printAll()
//------------------------------------------------------------

    ////FUN__________________________________________________________________________________________________
//fun empty() {
//}
//fun turboPushka(a: Long): Int {
//    return 1
//------------------------------------------------------------

    ////WHEN__________________________________________________________________________________________________
//    var N =1
//    var result = when(N) {
//        1, 2 -> "один или два "
//        3 -> "three"
//        4 -> "four"
//        5 -> "five"
//        else -> {
//            println("nothing")
//        }
//    }
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
}

