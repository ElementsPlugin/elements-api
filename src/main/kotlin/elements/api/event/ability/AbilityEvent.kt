package elements.api.event.ability

import elements.api.ability.Ability
import org.spongepowered.api.event.Event

interface AbilityEvent : Event {

    val ability: Ability
}