package elements.api.data.ability

import elements.api.ability.Ability
import org.spongepowered.api.data.manipulator.mutable.ListData
import org.spongepowered.api.data.value.mutable.ListValue

interface AbilityData : ListData<Ability, AbilityData, ImmutableAbilityData> {

    val selected: ListValue<Ability>
}