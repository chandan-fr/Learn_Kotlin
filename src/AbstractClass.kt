fun main() {
    val obj = ChildClass()
    obj.display()
//      val obj2 = ParentClass() // Cannot create an instance of an abstract class
}

private abstract class ParentClass (){
    val name:String = ""
    abstract fun display() // body will be defined by the child class
}

private class ChildClass (): ParentClass(){
    override fun display() {
        println("I am Child Class")
    }
}