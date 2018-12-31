package elements.api.ability

import elements.api.ability.executor.AbilityExecutionManager
import elements.api.ability.result.AbilityResult
import elements.api.activator.Activator
import elements.api.element.Element
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text

abstract class AbstractAbility(private val id: String, private val name: String, override val description: Text,
                               override val element: Element
) : Ability {

    override fun getId(): String = id

    override fun getName(): String = name

    abstract override suspend fun AbilityExecutionManager.execute(player: Player, activator: Activator): AbilityResult
}