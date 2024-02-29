import java.util.*

fun main() {
    val obj = Calculator()
    println(obj.add(2, 3))
    println(obj.multiply(2, 3))

    val p1 = Persons("chandan", 18)
    println(p1.name)
    println(p1.age)
    p1.age = 28
    println(p1.age)
}


// default constructor
/*
    when a class created without a constructor kotlin adds a default constructor in the class
    which is params less.
 */
private class Calculator {
    // for late initialization of value
    lateinit var msg: String

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

private class Persons(name: String, age: Int) {
    var name: String = name
        // getters
        get() = field.uppercase()
    var age: Int = age
        // setters
        set(value) = if (value > 0) field = value else println("age can't be negative")
}