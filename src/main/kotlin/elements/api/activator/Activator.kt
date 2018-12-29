package elements.api.activator

import elements.api.ability.Ability
import org.spongepowered.api.CatalogType

/**
 * An ability activator.
 *
 * An example could be one that activates an ability when the player sneaks.
 */
interface Activator : CatalogType {

    /**
     * Registers an ability to this activator.
     *
     * @return True if the registration was successful
     */
    fun register(ability: Ability): Boolean

    val registeredAbilities: Collection<Ability>
}