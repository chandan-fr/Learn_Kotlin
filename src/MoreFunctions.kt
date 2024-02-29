import kotlin.math.pow

fun main() {
    var fn: (x: Double, y: Double) -> Double = :: add
    val res = fn(1.0,2.0)
    println(res)
    fn = ::power
    println(fn(8.0, 3.0))
}

private fun add (x:Double, y: Double): Double {
    return x + y
}

private fun power (x:Double, y: Double): Double{
    return x.pow(y)
}