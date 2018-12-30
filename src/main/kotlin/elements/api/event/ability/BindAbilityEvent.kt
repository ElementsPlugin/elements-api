package elements.api.event.ability

import org.spongepowered.api.event.Cancellable

interface BindAbilityEvent : AbilityPlayerEvent, Cancellable {

    val slot: Int
}