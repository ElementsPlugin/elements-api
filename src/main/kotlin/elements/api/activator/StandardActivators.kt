package elements.api.activator

import elements.api.util.ext.getValue
import elements.api.util.ext.registry

/**
 * The standard ability activators.
 */
object StandardActivators {

    /**
     * The ability activates when the player left clicks.
     */
    val LEFT_CLICK: Activator by registry

    /**
     * The ability activates when the player right clicks.
     */
    val RIGHT_CLICK: Activator by registry

    /**
     * The ability activates when the player sneaks.
     */
    val SNEAK: Activator by registry

    /**
     * The ability activates when the player sprints.
     */
    val SPRINT: Activator by registry

    /**
     * The ability activates when the player selects its slot.
     */
    val PASSIVE: Activator by registry
}