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

interface Entity {
    fun performActions()
}

interface CanRun1 {
    fun canRun()
}

interface CanRead1 {
    fun canRead()
}

interface CanSwim1 {
    fun canSwim()
}

class Person1(val name: String) : Entity, CanRun1, CanRead1 {
    override fun canRun() {
        println("$name can run")
    }

    override fun canRead() {
        println("$name can read")
    }

    override fun performActions() {
        println("$name is performing actions")
        canRead()
        canRun()
    }
}

class Animal1(val name: String) : Entity, CanRun1, CanSwim1 {
    override fun canRun() {
        println("$name can run")
    }

    override fun canSwim() {
        println("$name can swim")
    }

    override fun performActions() {
        println("$name is performing actions")
        canRun()
        canSwim()
    }
}
