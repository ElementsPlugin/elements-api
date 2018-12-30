package elements.api.ability

import elements.api.element.Element
import elements.api.ability.result.AbilityResult
import elements.api.activator.Activator
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import sporoutines.CoroutineTaskManager

abstract class AbstractAbility(private val id: String, private val name: String, override val description: Text,
                               override val element: Element
) : Ability {

    override fun getId(): String = id

    override fun getName(): String = name

    abstract override suspend fun CoroutineTaskManager.execute(player: Player, activator: Activator): AbilityResult
}