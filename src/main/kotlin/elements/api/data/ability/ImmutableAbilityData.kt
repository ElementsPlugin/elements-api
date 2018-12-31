package elements.api.data.ability

import org.spongepowered.api.data.manipulator.immutable.ImmutableListData
import org.spongepowered.api.data.value.immutable.ImmutableListValue

interface ImmutableAbilityData : ImmutableListData<SlotInfo, ImmutableAbilityData, AbilityData> {

    val slots: ImmutableListValue<SlotInfo>
}