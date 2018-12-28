package elements.api.util

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider

inline fun <reified T> dummy(name: String): T =
        DummyObjectProvider.createFor(T::class.java, name)

inline fun <reified T, I : T> dummyExtended(name: String): I =
    DummyObjectProvider.createExtendedFor(T::class.java, name)