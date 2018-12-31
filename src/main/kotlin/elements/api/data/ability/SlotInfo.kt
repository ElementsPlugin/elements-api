package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.DataSerializable

interface SlotInfo : DataSerializable {

    val slot: Int

    val abilities: MutableMap<Activator, Ability>
}