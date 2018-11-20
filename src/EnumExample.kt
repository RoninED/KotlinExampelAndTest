enum class EnumExample(var type: String) {
    BMW("car"),
    AUDI("van"),
    KAMAZ("truck");

    fun printAll() {
        println(EnumExample.BMW.type)
        println(EnumExample.AUDI.type)
        println(EnumExample.KAMAZ.type)
    }
}