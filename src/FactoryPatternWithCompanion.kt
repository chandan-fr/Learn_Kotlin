fun main() {
    val tomato = Pizza.create("Tomato")
    println(tomato)

    // made the constructor private to explicitly call the create method to make a pizza
    val basic = Pizza.create("Basic")
    println(basic)
}

private class Pizza private constructor(val type:String, val toppings:String){
    companion object Factory{ // factory object to make pizza
        fun create(pizzaType:String):Pizza{
            return when(pizzaType){
                "Tomato"-> Pizza("Tomato", "Tomato, Cheese")
                "Peppy Paneer" -> Pizza("Peppy Paneer", "Paneer, Cheese Burst, Onion, Tomato")
                else -> Pizza("Basic", "Cheese, Onion")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', toppings='$toppings')"
    }

}