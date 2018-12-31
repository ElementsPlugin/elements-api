package elements.api.ability.executor

import org.spongepowered.api.scheduler.Task
import java.util.concurrent.TimeUnit

interface AbilityExecutor {

    val currentTask: Task?

    fun executeDelay(delay: Long, unit: TimeUnit, task: (Long) -> Unit)

    fun executeYield(unit: TimeUnit, task: (Long) -> Unit)
}