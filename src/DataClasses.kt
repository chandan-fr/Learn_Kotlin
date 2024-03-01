fun main() {
    val a1 = ClassA("john", 20)
    val a2 = ClassA("john", 20)
    println(a1) // toString
    println(a2)
    println(a2.hashCode())
    println(a2 == a1)   // a1.equals(a2)
    val a3 = a1.copy(age = 10, name = "alex")
    println(a3)

    // destructuring the value
    val (name: String, age: Int) = a2
    println(name)   // component1()
    println(age)    // component2()
// creates 2 function and return the value
    println(a2.component1())

}

data class ClassA(val name: String, val age: Int) {

}