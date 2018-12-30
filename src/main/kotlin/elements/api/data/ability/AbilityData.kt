package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.mutable.MappedData
import org.spongepowered.api.data.value.mutable.MapValue

interface AbilityData :
    MappedData<Int, MutableMap<Activator, Ability>, AbilityData, ImmutableAbilityData> {

    val slots: MapValue<Int, MutableMap<Activator, Ability>>
}