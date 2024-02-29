fun main() {
    val result = calculateSum(10, 15)
    println(result)

    val res2 = multiply(10,4)
    println(res2)

    printMsg("Chandan")

    sayHello()
    sayHello(4)
}

// defined return type
fun calculateSum(x: Int, y: Int): Int{
    return x + y
}

// inline function
fun multiply(x: Int, y: Int) = x * y

// unit type
fun printMsg(name:String){
    println("Hello $name")
}

// default arguments
fun sayHello(count: Int=2){
    for(i in 1..count){
        println("Hello $i")
    }
}
