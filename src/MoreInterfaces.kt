fun main() {
    val entities: Array<Entity> = arrayOf(
        Person1("Raju"),
        Person1("Bheem"),
        Person1("Chutki"),
        Animal1("Tiger"),
        Animal1("Fish")
    )

    performActions(entities)
}

fun performActions(entities: Array<Entity>) {
    for (entity in entities) {
        entity.performActions()
    }
}

interface Action {
    fun performAction()
}

interface Entity {
    fun performActions()
}

class Person1(val name: String) : Entity {
    private val actions: MutableList<Action> = mutableListOf()

    fun canRead() {
        actions.add(object : Action {
            override fun performAction() {
                println("$name is reading")
            }
        })
    }

    fun canRun() {
        actions.add(object : Action {
            override fun performAction() {
                println("$name is running")
            }
        })
    }

    override fun performActions() {
        actions.forEach { it.performAction() }
    }
}

class Animal1(val name: String) : Entity {
    private val actions: MutableList<Action> = mutableListOf()

    fun canRun() {
        actions.add(object : Action {
            override fun performAction() {
                println("$name is running")
            }
        })
    }

    fun canSwim() {
        actions.add(object : Action {
            override fun performAction() {
                println("$name is swimming")
            }
        })
    }

    override fun performActions() {
        actions.forEach { it.performAction() }
    }
}
