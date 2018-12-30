package elements.api.data.ability

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator
import org.spongepowered.api.data.value.immutable.ImmutableMapValue

interface ImmutableAbilityHotbarData : ImmutableDataManipulator<ImmutableAbilityHotbarData, AbilityHotbarData> {
    
    val slot0: ImmutableMapValue<Activator, Ability>

    val slot1: ImmutableMapValue<Activator, Ability>

    val slot2: ImmutableMapValue<Activator, Ability>

    val slot3: ImmutableMapValue<Activator, Ability>

    val slot4: ImmutableMapValue<Activator, Ability>

    val slot5: ImmutableMapValue<Activator, Ability>

    val slot6: ImmutableMapValue<Activator, Ability>

    val slot7: ImmutableMapValue<Activator, Ability>

    val slot8: ImmutableMapValue<Activator, Ability>
}
