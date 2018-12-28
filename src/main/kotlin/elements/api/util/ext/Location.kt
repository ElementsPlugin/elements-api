package elements.api.util.ext

import org.spongepowered.api.entity.Entity
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World

fun Location<World>.getNearbyEntities(distance: Double = 1.0): Collection<Entity> =
    extent.getNearbyEntities(position, distance)