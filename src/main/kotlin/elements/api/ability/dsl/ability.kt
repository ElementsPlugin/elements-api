package elements.api.ability.dsl

import elements.api.Element
import elements.api.ability.Ability
import elements.api.ability.AbilityExecutor
import elements.api.activator.Activator
import org.spongepowered.api.text.Text

fun ability(id: String, name: Text, description: Text, element: Element, activator: Activator, executor: AbilityExecutor): Ability =
    DslAbility(id, name, description, element, activator, executor)