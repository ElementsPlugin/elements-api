package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.mutable.MappedData
import org.spongepowered.api.data.value.mutable.MapValue

interface AbilityHotbarData :
    MappedData<Int, MutableMap<Activator, Ability>, AbilityHotbarData, ImmutableAbilityHotbarData> {

    val abilitySlots: MapValue<Int, MutableMap<Activator, Ability>>
}