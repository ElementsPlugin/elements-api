package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.DataManipulator
import org.spongepowered.api.data.value.mutable.MapValue

interface AbilityHotbarData : DataManipulator<AbilityHotbarData, ImmutableAbilityHotbarData> {

    val slot0: MapValue<Activator, Ability>

    val slot1: MapValue<Activator, Ability>

    val slot2: MapValue<Activator, Ability>

    val slot3: MapValue<Activator, Ability>

    val slot4: MapValue<Activator, Ability>

    val slot5: MapValue<Activator, Ability>

    val slot6: MapValue<Activator, Ability>

    val slot7: MapValue<Activator, Ability>

    val slot8: MapValue<Activator, Ability>
}