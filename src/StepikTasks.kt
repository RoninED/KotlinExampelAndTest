class StepikTasks {
}

class EngineNotFoundException() : Exception()
class SensorsMeltException() : Exception()
class SphinxesException() : Exception()

fun main(args: Array<String>) {

    fun calcNullValues(input: Array<Int?>):Array<Int>{
        var a:Int = 0
        var b:Int = 0
        for (tmp in input)
            when {
                tmp ==null -> a++
                else -> b+=tmp
            }

return arrayOf(a,b)
    }
    calcNullValues(arrayOf(null, 1,2)).forEach { print("$it ") }

}
