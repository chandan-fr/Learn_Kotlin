fun main() {
    val animal = "Horse"
    val number = 13
//    when(animal){
//        "Cat" -> println("Animal is Cat")
//        "Horse" -> println("Animal is Horse")
//        "Dog" -> println("Animal is Dog")
//        else -> println("Animal not found")
//    }

    // using as expression
    var result = when(animal){
        "Cat" -> "Animal is Cat"
        "Horse" -> "Animal is Horse"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found"
    }
    println(result)

    // combined with range
    result = when(number){
        11 -> "eleven"
        15 -> "fifteen"
        in 12..14 -> "present"
        else -> "not in range"
    }
    println(result)
}