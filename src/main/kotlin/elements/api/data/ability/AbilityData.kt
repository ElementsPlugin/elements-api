package elements.api.data.ability

import org.spongepowered.api.data.manipulator.mutable.ListData
import org.spongepowered.api.data.value.mutable.ListValue

interface AbilityData : ListData<SlotInfo, AbilityData, ImmutableAbilityData> {

    val slots: ListValue<SlotInfo>
}