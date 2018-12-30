package elements.api.event.ability

import org.spongepowered.api.event.Cancellable

interface UnbindAbilityEvent : AbilityEvent, Cancellable {

    val slot: Int
}