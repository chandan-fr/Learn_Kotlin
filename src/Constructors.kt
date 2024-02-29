fun main() {
    val car = Automobile("Car", 4, 5, true)
    val bike = Automobile("Bike", 2, 2, false)

    car.display()
    bike.display()
    val u1 = User("A", 20)
    u1.display()
    println(u1.canVote())

    val samsung = Phone()
    println(samsung.name)

}

// primary constructor
class Automobile (val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) // primary constructor
{
    /*
        variable started with var or val is treated as properties of the class
        without var or val it is treated as params
     */
    var airBags = if (hasAirBags) "Yes" else "No" // with the help of params a new property created

    fun display () = println("Name: $name\nTyres: $tyres\nSeats: $maxSeating\nAir Bags: $airBags")
}


// 2nd way of defining constructor
class User(paramsname:String, paramsage: Int){
    val name = paramsname
    var age = paramsage

    fun canVote():Boolean{
        return age > 18
    }

    fun display () = println("Name: $name\nAge: $age")
}

// initializer block
class Phone (){
    // executes at the time of object creation
    init {
        println("first init block")
    }
    val name = "Samsung"

    init {
        println("$name from second init block")
    }
}