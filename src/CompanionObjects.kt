fun main() {
    val x = MyClass.MyObject.f()
//    MyClass.AnotherObject.g()  // don't need AnotherObject ref anymore
    println(MyClass.g())
    MyClass.MyObject.f()
    return x
}
internal class MyClass(){
    object MyObject{
        fun f (){
            println("Form f function")
        }
    }

    companion object AnotherObject{
        @JvmStatic      // annotation for interoperable between kotlin and java as static method
        fun g()="Form g function"
    }
}