package elements.api.data.ability

import org.spongepowered.api.data.manipulator.ImmutableDataManipulator
import org.spongepowered.api.data.value.immutable.ImmutableListValue

interface ImmutableAbilityData : ImmutableDataManipulator<ImmutableAbilityData, AbilityData> {

    val selected: ImmutableListValue<String>
}