package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.mutable.ListData
import org.spongepowered.api.data.value.mutable.ListValue

interface AbilityHotbarData :
    ListData<Map<Activator, Ability>, AbilityHotbarData, ImmutableAbilityHotbarData> {

    val abilitySlots: ListValue<Map<Activator, Ability>>
}