package elements.api.activator

abstract class AbstractActivator(private val id: String, private val name: String) : Activator {

    override fun getId(): String = id

    override fun getName(): String = name

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other !is Activator -> false
        else -> this.id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String = id
}