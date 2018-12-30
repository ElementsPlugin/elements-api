package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.immutable.ImmutableMappedData
import org.spongepowered.api.data.value.immutable.ImmutableMapValue

interface ImmutableAbilityHotbarData :
    ImmutableMappedData<Int, MutableMap<Activator, Ability>, ImmutableAbilityHotbarData, AbilityHotbarData> {

    val abilitySlots: ImmutableMapValue<Int, MutableMap<Activator, Ability>>
}