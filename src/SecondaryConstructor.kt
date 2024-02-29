fun main() {
    val bajaj = TwoWheeler("Bajaj", "EV") // calling secondary constructor
    val hero = TwoWheeler("Hero", "Petrol", 2, 3) // calling primary constructor

    bajaj.showDetails()
    hero.showDetails()
}

private class TwoWheeler (val name: String, val type: String, val tyres: Int, val seats: Int){
    constructor(sname: String, stype: String): this(sname, stype, tyres = 2, seats = 2)

    fun showDetails(){
        println("Name: $name\nTyres: $tyres\nSeats: $seats\nType: $type")
    }
}