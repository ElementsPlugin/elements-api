package elements.api.data.ability

import org.spongepowered.api.data.manipulator.DataManipulator
import org.spongepowered.api.data.value.mutable.ListValue

interface AbilityData : DataManipulator<AbilityData, ImmutableAbilityData> {

    val selected: ListValue<String>
}