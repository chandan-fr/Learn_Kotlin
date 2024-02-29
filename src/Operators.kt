fun main() {
    var i = 13
    var j = 2

//    arithmeticOps(i, j)
//    relationalOps(i,j)
//    prePostInc()
//    prePostDec()
    logicalOps()
}

fun arithmeticOps (i : Int, j : Int){
    println("Addition: " + (i + j))
    println("Subtraction: " + (i - j))
    println("Multiplication: " + (i * j))
    println("int Division: " + (i / j))      // integer division
    println("Division: " + (i.toFloat() / j))        // float division
    println("Modulus: " + (i % j))
}

private fun relationalOps(i : Int, j : Int){
    println("gt: " + (i > j))
    println("lt: " + (i < j))
    println("gte: " + (i >= j))
    println("lte: " + (i <= j))
    println("double equal: " + (i == j))
    println("ne: " + (i != j))
}

private fun prePostInc(){
    var i = 10
    println(i++)
    println(++i)
}

private fun prePostDec(){
    var i = 10
    println(i--)
    println(--i)
}

private fun logicalOps(){
    val above70 = false
    val knowsPrograming = true

    var result = above70 && knowsPrograming
    println("and result: " + result)

    result = above70 || knowsPrograming
    println("or result: " + result)

    println("not result: " + !above70)
}