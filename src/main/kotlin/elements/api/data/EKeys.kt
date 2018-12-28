package elements.api.data

import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.ListValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    val SELECTED_ABILITIES: Key<ListValue<String>> =
        DummyObjectProvider.createExtendedFor(Key::class.java, "SELECTED_ABILITY")
}