package elements.api.ability

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
     * Gets a registered ability with the given id, if it exists.
     *
     * @return The ability, or null
     */
    operator fun get(abilityId: String): Ability?

    /**
     * Registers the given ability with the given plugin.
     */
    fun register(ability: Ability)
}