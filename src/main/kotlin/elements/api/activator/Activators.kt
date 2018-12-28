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
    var LEFT_CLICK = dummy<Activator>("LEFT_CLICK")

    /**
     * The ability activates when the player right clicks.
     */
    @JvmField
    var RIGHT_CLICK = dummy<Activator>("RIGHT_CLICK")

    /**
     * The ability activates when the player sneaks.
     */
    @JvmField
    var SNEAK = dummy<Activator>("SNEAK")

    /**
     * The ability activates when the player sprints.
     */
    @JvmField
    var SPRINT = dummy<Activator>("SPRINT")

    /**
     * The ability activates when the player joins the game.
     *
     * This is useful for passives that operate in a continuous loop.
     */
    @JvmField
    var JOIN = dummy<Activator>("JOIN")
}