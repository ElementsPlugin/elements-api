package elements.api.ability.dsl

import elements.api.Element
import elements.api.ability.Ability
import elements.api.ability.AbilityExecutor
import elements.api.activator.Activator
import org.spongepowered.api.text.Text

internal data class DslAbility(
    override val id: String,
    override val name: Text,
    override val description: Text,
    override val element: Element,
    override val activator: Activator,
    override val executor: AbilityExecutor
) : Ability