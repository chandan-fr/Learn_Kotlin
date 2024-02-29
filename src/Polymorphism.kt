fun main() {
//    val circle: Shape = Circle(4.0)
//    val square: Shape = Square(8.2)
//    println(circle.area())
//    println(square.area())

    val shapes = arrayOf(
        Square(3.0), Square(4.0),
        Circle(4.2), Triangle(3.0, 6.0)
    )
    calculateArea(shapes)
}

fun calculateArea(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}

open class Shape() {
    open fun area(): Double = 0.00
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double = 0.5 * height * base
}