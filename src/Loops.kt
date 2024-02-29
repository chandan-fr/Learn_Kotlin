fun main() {
//    whileLoop()
    forLoop()
}

fun whileLoop(){
    var x = 2
    var idx = 1

    while (idx <=10){
        println(x * idx)
        idx++
    }
}

fun forLoop(){
    val number = 2

    for (i in 1..5){
        println(i)
    }

    println("============== until ===============")

    for (i in 1 until 5){
        println(i)
    }

    println("============== step ===============")

    for (i in 1 .. 10 step 2){
        println(i)
    }

    println("============== string template ===============")

    for (i in 1 .. 10){
        println("$number x $i = ${number * i}")
    }

    println("============== downTo ===============")
    for (i in 10 downTo 1){
        println(i)
    }
}