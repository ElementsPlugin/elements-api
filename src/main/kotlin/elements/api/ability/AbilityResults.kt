package elements.api.ability

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object AbilityResults {

    @JvmField
    val OK = DummyObjectProvider.createFor(AbilityResult::class.java, "OK")

    @JvmField
    val CANCELLED = DummyObjectProvider.createFor(AbilityResult::class.java, "CANCELLED")

    @JvmField
    val ON_COOLDOWN = DummyObjectProvider.createFor(AbilityResult::class.java, "ON_COOLDOWN")
}