fun main() {
    val entities: Array<Entity2> = arrayOf(
        Person2("Raju"),
        Person2("Bheem"),
        Person2("Chutki"),
        Animal2("Tiger"),
        Animal2("Fish")
    )

    performActions(entities)
}

fun performActions(entities: Array<Entity2>) {
    for (entity in entities) {

        entity.performActions()
    }
}

interface CanRun2 {
    fun run()
}

interface CanRead2 {
    fun read()
}

interface CanSwim {
    fun swim()
}

interface Entity2 : CanRun2, CanRead2, CanSwim {
    fun performActions()
}

class Person2(val name: String) : Entity2 {
    override fun run() {
        println("$name is running")
    }

    override fun read() {
        println("$name is reading")
    }

    override fun swim() {
        // Person can't swim, so this method is empty
    }

    override fun performActions() {
        run()
        read()
    }
}

class Animal2(val name: String) : Entity2 {
    override fun run() {
        println("$name is running")
    }

    override fun read() {
        // Animals can't read, so this method is empty
    }

    override fun swim() {
        println("$name is swimming")
    }

    override fun performActions() {
        run()
        swim()
    }
}
