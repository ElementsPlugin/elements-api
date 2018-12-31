package elements.api.data.ability

import org.spongepowered.api.data.manipulator.mutable.MappedData
import org.spongepowered.api.data.value.mutable.MapValue

interface AbilityData :
    MappedData<Int, SlotInfo, AbilityData, ImmutableAbilityData> {

    val slots: MapValue<Int, SlotInfo>
}