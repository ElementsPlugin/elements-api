package elements.api.ability.executor

import org.spongepowered.api.scheduler.Task

interface AbilityExecution {

    val plugin: Any

    val currentTask: Task?

    fun cancel()
}