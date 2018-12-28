package elements.api.ability

import org.spongepowered.api.Sponge

object AbilityResults {

    val OK: AbilityResult by lazy {
        Sponge.getRegistry().getType(AbilityResult::class.java, "ok").get()
    }

    val CANCELLED: AbilityResult by lazy {
        Sponge.getRegistry().getType(AbilityResult::class.java, "cancelled").get()
    }

    val ON_COOLDOWN: AbilityResult by lazy {
        Sponge.getRegistry().getType(AbilityResult::class.java, "on_cooldown").get()
    }
}