package elements.api.ability.service

import elements.api.ability.Ability
import org.spongepowered.api.Sponge

interface AbilityService {

    /**
     * Simulates static access for ease of use.
     */
    companion object : AbilityService by Sponge.getServiceManager().provideUnchecked(AbilityService::class.java);

    /**
     * Gets a [Collection] of all [Abilities][Ability].
     *
     * @return The abilities
     */
    val abilities: Collection<Ability>

    /**
     * Checks if the given ability id is currently registered.
     *
     * @return True if the given ability id is currently registered
     */
    operator fun contains(abilityId: String): Boolean

    /**
     * Registers the given ability with the given plugin.
     */
    fun register(plugin: Any, ability: Ability)
}