package elements.api.data

import elements.api.data.ability.SlotInfo
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.ListValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    var ABILITY_SLOTS: Key<ListValue<SlotInfo>> =
        DummyObjectProvider.createExtendedFor(Key::class.java, "ABILITY_SLOTS")
}