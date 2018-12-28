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

    /**
     * The ability activates when the player joins the game.
     *
     * This is useful for passives that operate in a continuous loop.
     */
    @JvmField
    val JOIN = dummy<Activator>("JOIN")

    /**
     * The ability activates when the player selects it.
     *
     * This is useful for passives that operate in a continuous loop.
     */
    @JvmField
    val SELECT = dummy<Activator>("SELECT")
}