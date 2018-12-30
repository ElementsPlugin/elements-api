package elements.api.event.ability

import elements.api.activator.Activator
import org.spongepowered.api.event.Cancellable

interface ActivateAbilityEvent : AbilityPlayerEvent, Cancellable {

    val activator: Activator

    val slot: Int
}