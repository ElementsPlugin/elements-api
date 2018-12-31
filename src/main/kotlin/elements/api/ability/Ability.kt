package elements.api.ability

import elements.api.ability.executor.AbilityExecutionManager
import elements.api.ability.result.AbilityResult
import elements.api.activator.Activator
import elements.api.element.Element
import org.spongepowered.api.CatalogType
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text

interface Ability : CatalogType {

    override fun getId(): String

    override fun getName(): String

    val description: Text

    val element: Element

    val activators: Set<Activator>

    suspend fun AbilityExecutionManager.execute(player: Player, activator: Activator): AbilityResult

    fun checkPermission(player: Player): Boolean =
        player.hasPermission("elements.ability.$id") && player.hasPermission("elements.element.${element.id}")
}