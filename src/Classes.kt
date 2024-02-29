fun main() {
    val mustang = Car("Mustang", "Diesel", 100)
    val beetle = Car("Beetle", "Petrol", 120)

    mustang.driveCar()
    beetle.display()
    mustang.applyBrakes()
}

class Car (val name: String, val type: String, var kmRan : Int ){
    fun driveCar(){
        println("$name is ready to drive")
    }

    fun applyBrakes(){
        println("$name has stopped!")
    }
    fun display (){
        println("Name : $name")
        println("Type : $type")
        println("Km Ran : $kmRan")
    }
}