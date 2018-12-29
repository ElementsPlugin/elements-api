package elements.api.ability

import elements.api.element.Element
import elements.api.ability.result.AbilityResult
import elements.api.activator.Activator
import elements.api.data.Versions
import org.spongepowered.api.CatalogType
import org.spongepowered.api.data.DataContainer
import org.spongepowered.api.data.DataQuery
import org.spongepowered.api.data.DataSerializable
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import sporoutines.CoroutineTaskManager

typealias AbilityExecutor = suspend CoroutineTaskManager.(Player) -> AbilityResult

interface Ability : CatalogType, DataSerializable {

    override fun getId(): String

    override fun getName(): String

    val description: Text

    val element: Element

    val activator: Activator

    suspend fun CoroutineTaskManager.execute(player: Player): AbilityResult

    override fun toContainer(): DataContainer = DataContainer.createNew().set(DataQuery.of(), id)

    override fun getContentVersion(): Int = Versions.ABILITY
}