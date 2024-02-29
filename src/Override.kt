fun main() {
    val oneplus = OnePlus("Smartphone")
    val genmobo = Mobile()
    val genmobo1 = Mobile("Phablet",  8)
    genmobo.showDetails()
    genmobo.display()
    genmobo1.showDetails()
    genmobo1.display()

    oneplus.makeCall()
    oneplus.display()
    oneplus.showDetails()
}

private open class Mobile ( name:String = "Mobile", size:Int = 5){
    open val name:String = name
    open val size:Int = size
    open val type: String = "Basic"

    open fun display ()= println("Simple Display size- $size")
    fun makeCall()= println("Calling...")
    open fun showDetails()= println("name- $name, size- $size, type- $type")
}

private class OnePlus (type:String): Mobile(){
    override val name: String = "OnePlus"
    override val size:Int = 6
    override val type: String = type

    override fun display() {
        super.display()
        println("OnePlus Display $size\" ")
    }

    override fun showDetails() {
        println("name- $name, size- $size\", type- $type")
    }
}