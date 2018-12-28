package elements.api.data

import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.BaseValue
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

object EKeys {

    @JvmField
    val SELECTED_ABILITY: Key<out BaseValue<String>> =
        DummyObjectProvider.createExtendedFor(Key::class.java, "SELECTED_ABILITY")
}