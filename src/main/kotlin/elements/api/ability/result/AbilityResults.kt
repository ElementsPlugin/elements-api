package elements.api.ability.result

import elements.api.util.ext.getValue
import elements.api.util.ext.registry

object AbilityResults {

    val OK: AbilityResult by registry

    val CANCELLED: AbilityResult by registry

    val ON_COOLDOWN: AbilityResult by registry
}