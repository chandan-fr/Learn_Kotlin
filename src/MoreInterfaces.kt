fun main() {
    val entities: Array<Entity> = arrayOf(
        Person1("Raju"),
        Person1("Bheem"),
        Person1("Chutki"),
        Animal1("Tiger"),
        Animal1("Fish")
    )

    for (entity in entities) {
        entity.performActions()
    }
}

private interface Entity {
    fun performActions()
}

interface CanSwim {
    fun swim()
}

private class Person1(val name: String) : Entity, CanRun, CanRead {
    override fun run() {
        println("$name can run")
    }

    override fun read() {
        println("$name can read")
    }

    override fun performActions() {
        println("$name is performing actions")
        run()
        read()
    }
}

class Animal1(val name: String) : Entity, CanRun, CanSwim {
    override fun run() {
        println("$name can run")
    }

    override fun swim() {
        println("$name can swim")
    }

    override fun performActions() {
        println("$name is performing actions")
        run()
        swim()
    }
}
