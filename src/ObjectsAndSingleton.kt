fun main() {
//    println(A.name)
//    B.sayMyName()
    CalculateLikes.incFbLike()
    CalculateLikes.incFbLike()
    CalculateLikes.incTwitterLike()
    CalculateLikes.displayLikes()

    // object expression without a name
    val testObj = object {
        val x = 20
        fun testMethod()= println("object expression")
    }

    testObj.testMethod()

    val obj = object : Cloneable{
        override fun clone() {
            println("i am clone")
        }
    }
    obj.clone()
    
    val obj2 = object : TestClass() {
        override fun fullName() {
            super.fullName()
            println("printing Full Name")
        }
    }
    obj2.fullName()
}

// object declaration
object A{
    val name = "chandan"
}
object B{
    var num = 20
    fun sayMyName() = println("My name is Chandan $num")
    init {
        println("init block"+ num)
        num++
    }
}

// singleton pattern i.e. class with only single object
object CalculateLikes{
    private var fbLike:Int = 0
    private var twitterLike:Int = 0

    fun incFbLike()= fbLike++
    fun incTwitterLike()= twitterLike++
    fun displayLikes()= println("Facebook- $fbLike\nTwitter- $twitterLike")
}

// object expression
private interface Cloneable{
    fun clone()
}

private open class TestClass{
    open fun fullName() = println("From super class")
}