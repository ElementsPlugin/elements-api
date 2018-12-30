package elements.api.event.ability

import org.spongepowered.api.event.Cancellable

interface BindAbilityEvent : AbilityEvent, Cancellable {

    val slot: Int
}