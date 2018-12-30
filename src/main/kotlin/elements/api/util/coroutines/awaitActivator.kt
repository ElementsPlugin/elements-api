package elements.api.util.coroutines

import com.google.common.collect.LinkedListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import elements.api.ability.Ability
import elements.api.activator.Activator
import elements.api.event.ability.ActivateAbilityEvent
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.filter.Getter
import java.util.*
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun Player.awaitActivator(ability: Ability, activator: Activator) =
    suspendCoroutine<Unit> { cont ->
        ActivatorListener.waitMap.put(
            this.uniqueId,
            ActivatorListener.ActivatorContinuation(ability, activator, cont)
        )
    }

/**
 * For internal use only.
 *
 * Do NOT register this object as a listener to your plugin; The Elements plugin already registers it.
 */
object ActivatorListener {

    internal data class ActivatorContinuation(
        val ability: Ability,
        val activator: Activator,
        val cont: Continuation<Unit>
    )

    internal val waitMap: ListMultimap<UUID, ActivatorContinuation> =
        Multimaps.synchronizedListMultimap(LinkedListMultimap.create<UUID, ActivatorContinuation>())

    @Listener
    fun onActivate(event: ActivateAbilityEvent, @Getter("getTargetEntity") player: Player) {
        for (continuation in waitMap[player.uniqueId]) {
            if (continuation.ability == event.ability && continuation.activator == event.activator) {
                // Cancel the event so it doesn't trigger a new ability execution,
                // and instead resumes the currently suspended ability execution.
                event.isCancelled = true

                // Resume ability execution.
                continuation.cont.resume(Unit)

                // Remove it from the list.
                waitMap.remove(player.uniqueId, continuation)
            }
        }
    }
}