package elements.api.event.ability

import org.spongepowered.api.event.Cancellable

interface UnbindAbilityEvent : AbilityPlayerEvent, Cancellable {

    val slot: Int
}