package elements.api.ability.executor

import kotlinx.coroutines.CoroutineScope
import org.spongepowered.api.scheduler.Task
import java.util.concurrent.TimeUnit
import kotlin.coroutines.Continuation

interface AbilityExecutionManager : CoroutineScope, Continuation<Unit> {

    val currentTask: Task?

    val isRepeating: Boolean

    suspend fun delay(delay: Long, unit: TimeUnit = TimeUnit.MILLISECONDS): Long

    suspend fun yield(unit: TimeUnit = TimeUnit.MILLISECONDS): Long

    suspend fun repeat(interval: Long, unit: TimeUnit = TimeUnit.MILLISECONDS)
}