package ExampleCompanionObject

class Temp {

    init {
        print("1 ")
        asd = 3
    }

    companion object {
        var asd = 4
        fun a(): Int = asd
    }
}