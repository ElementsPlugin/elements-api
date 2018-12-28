package elements.api.util.ext

import org.spongepowered.api.CatalogType
import org.spongepowered.api.GameRegistry
import org.spongepowered.api.Sponge
import kotlin.reflect.KProperty

inline val registry: GameRegistry get() = Sponge.getRegistry()

inline fun <reified T : CatalogType> GameRegistry.getType(id: String): T? =
    this.getType<T>(T::class.java, id).unwrap()

inline operator fun <reified T : CatalogType> GameRegistry.getValue(self: Any, property: KProperty<*>): T =
    this.getType(T::class.java, property.name.toLowerCase()).unwrap()!!