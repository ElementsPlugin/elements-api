package elements.api.data.ability

import org.spongepowered.api.data.manipulator.immutable.ImmutableListData
import org.spongepowered.api.data.value.immutable.ImmutableListValue

interface ImmutableAbilityData : ImmutableListData<String, ImmutableAbilityData, AbilityData> {

    val selected: ImmutableListValue<String>
}