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

private fun performActions(entities: Array<Entity2>) {
    for (entity in entities) {
        entity.performActions()
    }
}

private interface Entity2 : CanRun, CanRead, CanSwim {
    fun performActions()
}

private class Person2(val name: String) : Entity2 {
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

private class Animal2(val name: String) : Entity2 {
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
