package elements.api.data

import elements.api.ability.Ability
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.ListValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    var SELECTED_ABILITIES: Key<ListValue<Ability>> =
        DummyObjectProvider.createExtendedFor(Key::class.java, "SELECTED_ABILITY")
}