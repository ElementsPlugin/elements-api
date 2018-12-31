package elements.api

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.entity.living.player.Player

interface AbilitySlotService {

    operator fun get(player: Player): Map<Int, Map<Activator, Ability>>

    operator fun get(player: Player, slot: Int): Map<Activator, Ability>

    operator fun get(player: Player, slot: Int, activator: Activator): Ability?

    operator fun set(player: Player, slot: Int, activator: Activator, ability: Ability?)
}