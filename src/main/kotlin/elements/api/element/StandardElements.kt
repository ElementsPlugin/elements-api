package elements.api.element

import elements.api.util.ext.getValue
import elements.api.util.ext.registry

/**
 * The standard bending elements.
 */
object StandardElements {

    /**
     * Airbending.
     */
    val AIR: Element by registry

    /**
     * Earthbending.
     */
    val EARTH: Element by registry

    /**
     * Firebending.
     */
    val FIRE: Element by registry

    /**
     * Waterbending.
     */
    val WATER: Element by registry
}