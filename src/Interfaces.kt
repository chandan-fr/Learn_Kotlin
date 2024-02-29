fun main() {
    val running: Array<CanRun> = arrayOf(
        Cat("Tom Cat"), Dog("Spike Dog"), Mouse("Jerry Mouse"),
        Man("Bheem")
    )

    val reading: Array<Any> = arrayOf(Man("Raju"), Man("Bheem"), Woman("Chutki"))

    runningObjects(running)
    readingObjects(reading)
}

fun runningObjects(running: Array<CanRun>) {
    for (entity in running) {
        entity.run()
    }
}

fun readingObjects(reading: Array<Any>) {
    for (entity in reading) {
        if(entity is CanRun){
            entity.run()
        }
        if (entity is CanRead){
            entity.read()
        }
    }
}

interface CanRun {
    fun run()
}

interface CanRead {
    fun read()
}

abstract class Animal() : CanRun {
    abstract fun displayName()
}

class Cat(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

class Dog(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

class Mouse(val name: String) : Animal() {
    override fun run() = println("$name is running")

    override fun displayName() {
        println(name)
    }
}

class Man(val name: String) : CanRun, CanRead {
    override fun run() = println("$name is running")
    override fun read() = println("$name is reading")
}

class Woman(val name: String) : CanRun, CanRead {
    override fun run() = println("$name is running")
    override fun read() = println("$name is reading")
}
