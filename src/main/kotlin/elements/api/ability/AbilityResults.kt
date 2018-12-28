package elements.api.ability

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object AbilityResults {

    @JvmField
    var OK: AbilityResult = DummyObjectProvider.createFor(AbilityResult::class.java, "OK")

    @JvmField
    var CANCELLED: AbilityResult = DummyObjectProvider.createFor(AbilityResult::class.java, "CANCELLED")

    @JvmField
    var ON_COOLDOWN: AbilityResult = DummyObjectProvider.createFor(AbilityResult::class.java, "ON_COOLDOWN")
}