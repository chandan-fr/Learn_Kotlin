package SOLID

open class CarEx{
    fun getCabinWidth():Int = 40
}

class RacingCarEx: CarEx(){
    fun getCockpitWidth():Int = 20
}

fun main() {
    val list:MutableList<CarEx> = mutableListOf(RacingCarEx(), CarEx())

    list.forEach {
        when(it){
            is RacingCarEx -> println(it.getCockpitWidth())
            else -> println(it.getCabinWidth())
        }
    }
}