fun main() {
    var number = 10
    number = 20     // Var can be reassigned
    println("number ==> " + number)

    val name = "chandan"
    // name = "halder"      // Val cannot be reassigned
    println("name ==> " + name)

    dataType()
}

fun dataType(){
    var score : Int = 10
    var temperature : Double = 98.4
    var isRaining : Boolean = true
    var alphabet : Char = 'c'
    var message : String = "Chandan"

    println("score ==> " + score)
    println("temperature ==> " + temperature)
    println("isRaining ==> " + isRaining)
    println("alphabet ==> " + alphabet)
    println("message ==> " + message)
}


/*
Data types
1> INTEGER (Byte, Short, Int, Long)
2> FLOATING POINT(Float, Double)
3> BOOLEAN(True, False)
4> CHARACTER(Char, String)
*/