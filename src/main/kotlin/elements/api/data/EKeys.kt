package elements.api.data

import elements.api.ability.Ability
import elements.api.activator.Activator
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.MapValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    var ABILITY_SLOTS: Key<MapValue<Int, MutableMap<Activator, Ability>>> =
            DummyObjectProvider.createExtendedFor(Key::class.java, "ABILITY_SLOTS")

}