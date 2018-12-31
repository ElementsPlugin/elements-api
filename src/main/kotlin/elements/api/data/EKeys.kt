package elements.api.data

import elements.api.data.ability.SlotInfo
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.MapValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    var ABILITY_SLOTS: Key<MapValue<Int, SlotInfo>> =
        DummyObjectProvider.createExtendedFor(Key::class.java, "ABILITY_SLOTS")
}