package SOLID

/*
  L = liskov substitution principle i.e. objects of the subtypes are interconvertible to each other
  without breaking its functionality
 */

interface Vehicle {
    fun getInteriorWidth(): Int
}

open class Car : Vehicle {
    protected open fun getCabinWidth(): Int = 40

    override fun getInteriorWidth(): Int = getCabinWidth()
}

class RacingCar : Vehicle {
    private fun getCockpitWidth(): Int = 20

    override fun getInteriorWidth(): Int = getCockpitWidth()
}

class Maruti: Car(){
    override fun getCabinWidth(): Int {
        return 35
    }

    override fun getInteriorWidth(): Int {
        return getCabinWidth()
    }
}

class Tata:Car(){
    override fun getCabinWidth(): Int {
        return 37
    }

    override fun getInteriorWidth(): Int {
        return getCabinWidth()
    }
}

fun main() {
    val list: MutableList<Vehicle> = mutableListOf(RacingCar(), Car(), Maruti(), Tata())

    list.forEach {
        println(it.getInteriorWidth())
    }
}