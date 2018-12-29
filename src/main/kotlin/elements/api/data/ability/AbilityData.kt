package elements.api.data.ability

import org.spongepowered.api.data.manipulator.mutable.ListData
import org.spongepowered.api.data.value.mutable.ListValue

interface AbilityData : ListData<String, AbilityData, ImmutableAbilityData> {

    val selected: ListValue<String>
}