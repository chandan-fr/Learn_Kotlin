package SOLID

//  S = single responsibility principle i.e. a class should have only one responsibility

class Square(){
    fun calculateArea(side: Int): Int = side * side
    fun calculatePerimeter(side: Int): Int = 4 * side
}

class SquareUi(){
    fun renderSquare()= println("Render Square")
    fun renderLargeSquare()= println("Render Large Square")
}