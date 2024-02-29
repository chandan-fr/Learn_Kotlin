fun main() {
    val running: Array<CanRun> = arrayOf(
        Cat("Tom Cat"), Dog("Spike Dog"), Mouse("Jerry Mouse"),
        Man("Bheem")
    )

    val reading: Array<Any> = arrayOf(Man("Raju"), Man("Bheem"), Woman("Chutki"))

    runningObjects(running)
    readingObjects(reading)
}

private fun runningObjects(running: Array<CanRun>) {
    for (entity in running) {
        entity.run()
    }
}

private fun readingObjects(reading: Array<Any>) {
    for (entity in reading) {
        if(entity is CanRun){
            entity.run()
        }
        if (entity is CanRead){
            entity.read()
        }
    }
}

internal interface CanRun {
    fun run()
}

internal interface CanRead {
    fun read()
}

private abstract class Animal() : CanRun {
    abstract fun displayName()
}

private class Cat(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

private class Dog(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

private class Mouse(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

private class Man(val name: String) : CanRun, CanRead {
    override fun run() = println("$name is running")
    override fun read() = println("$name is reading")
}

private class Woman(val name: String) : CanRun, CanRead {
    override fun run() = println("$name is running")
    override fun read() = println("$name is reading")
}
