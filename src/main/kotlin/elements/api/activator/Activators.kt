package elements.api.activator

import elements.api.util.dummy

/**
 * The standard ability activators.
 */
object Activators {

    /**
     * The ability activates when the player left clicks.
     */
    @JvmField
    val LEFT_CLICK = dummy<Activator>("LEFT_CLICK")

    /**
     * The ability activates when the player right clicks.
     */
    @JvmField
    val RIGHT_CLICK = dummy<Activator>("RIGHT_CLICK")

    /**
     * The ability activates when the player sneaks.
     */
    @JvmField
    val SNEAK = dummy<Activator>("SNEAK")

    /**
     * The ability activates when the player sprints.
     */
    @JvmField
    val SPRINT = dummy<Activator>("SPRINT")
}