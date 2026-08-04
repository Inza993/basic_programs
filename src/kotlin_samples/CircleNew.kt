package kotlin_samples

class CircleNew(val radius: Double) : Shape {
    override fun computeArea() = Math.PI * radius * radius
}

fun main() {
    val c = CircleNew(3.0)
    println(c.computeArea())

    val b: B = B(10)
    println(b.i)
    b.getSuper()
    println("b.j ${b.j}")
    b.j = 21
    println("b.j ${b.j}")
}

open class A(open val i: Int) {
    open var j: Int = 11
}

class B(override val i: Int) : A(i + 10) {

    override var j: Int = 0
        get() = super.j + field
        set(value) {
            field = value
        }

    fun getSuper() {
        println(super.i)
    }
}

