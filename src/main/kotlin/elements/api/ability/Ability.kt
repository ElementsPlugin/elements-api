package elements.api.ability

import elements.api.element.Element
import elements.api.ability.result.AbilityResult
import elements.api.activator.Activator
import org.spongepowered.api.CatalogType
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import sporoutines.CoroutineTaskManager

typealias AbilityExecutor = suspend CoroutineTaskManager.(Player) -> AbilityResult

interface Ability : CatalogType {

    override fun getId(): String

    override fun getName(): String

    val description: Text

    val element: Element

    val activator: Activator

    suspend fun CoroutineTaskManager.execute(player: Player): AbilityResult
}