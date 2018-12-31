package elements.api.data.ability

import org.spongepowered.api.data.manipulator.immutable.ImmutableMappedData
import org.spongepowered.api.data.value.immutable.ImmutableMapValue

interface ImmutableAbilityData :
    ImmutableMappedData<Int, SlotInfo, ImmutableAbilityData, AbilityData> {

    val slots: ImmutableMapValue<Int, SlotInfo>
}