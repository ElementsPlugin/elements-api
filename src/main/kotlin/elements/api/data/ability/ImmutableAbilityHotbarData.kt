package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.immutable.ImmutableListData
import org.spongepowered.api.data.value.immutable.ImmutableListValue

interface ImmutableAbilityHotbarData :
    ImmutableListData<Map<Activator, Ability>, ImmutableAbilityHotbarData, AbilityHotbarData> {

    val abilitySlots: ImmutableListValue<Map<Activator, Ability>>
}