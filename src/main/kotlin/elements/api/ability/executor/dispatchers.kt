package elements.api.ability.executor

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import org.spongepowered.api.Sponge

fun syncDispatcher(plugin: Any): CoroutineDispatcher =
        Sponge.getScheduler().createSyncExecutor(plugin).asCoroutineDispatcher()