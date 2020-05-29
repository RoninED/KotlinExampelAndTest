import kotlin.math.pow
import kotlin.math.sqrt

fun main(args : Array<String>) {
    val countries: Array<String> = arrayOf("Russia", "USA", "Italy", "China")
    val capitals: Array<String> = arrayOf("Moscow", "Washington", "Rome", "Peking")
    val currency: Array<String> = arrayOf("rub", "usd", "euro", "yuan")
    for (i in 0 until countries.size)
        println(countries[i] + "\t" + capitals[i] + "\t"+ currency[i])
}




