fun main() {
    val objchild = Child()

    objchild.parentFun()
    objchild.childFun()
}

private open class Parent{
    init {
        println("parent called")
    }
    val name:String = "parent"
    fun parentFun()= println("from parent")
}

private class Child:Parent(){
    init {
        println("Child called")
    }
    val name1:String = "child"
    fun childFun()= println("from child")
}