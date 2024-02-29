fun main() {
    val x = 10
    var result = x in 1..5
    println(result)

    result = x in 1 until 10     // upperbound not included i.e. 10
    println(result)
}