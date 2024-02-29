fun main() {
    println(addition(1,5))
    println(addition(1.0,5.0))
    println(addition(x=5,y=5))
    println(addition(y=2, x=5))
}

fun addition(x:Int, y: Int)= x + y

fun addition(x:Double, y: Double)= x + y