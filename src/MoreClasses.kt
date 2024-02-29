fun main() {
    val p1 = Person("A", 22)
    val p2 = Person("B", 17)

    println(p1.canVote())
    println(p2.canVote())
    p2.age = 20
    println(p2.canVote())
}

class Person(val name:String, var age: Int){
    fun canVote():Boolean{
        return age > 18
    }
}