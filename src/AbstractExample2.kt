class AbstractExample2: AbstractExample() {
    override var b: Int
        get() = super.b
        set(value) {}


    override fun c() {
       b--
    }
}