package elements.api.ability

import elements.api.Element
import elements.api.activator.Activator
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import sporoutines.CoroutineTaskManager

typealias AbilityExecutor = suspend CoroutineTaskManager.(Player) -> AbilityResult

interface Ability {

    val id: String

    val name: Text

    val description: Text

    val element: Element

    val activator: Activator

    val executor: AbilityExecutor
}