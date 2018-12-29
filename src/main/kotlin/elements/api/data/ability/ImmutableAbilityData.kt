package elements.api.data.ability

import elements.api.ability.Ability
import org.spongepowered.api.data.manipulator.immutable.ImmutableListData
import org.spongepowered.api.data.value.immutable.ImmutableListValue

interface ImmutableAbilityData : ImmutableListData<Ability, ImmutableAbilityData, AbilityData> {

    val selected: ImmutableListValue<Ability>
}