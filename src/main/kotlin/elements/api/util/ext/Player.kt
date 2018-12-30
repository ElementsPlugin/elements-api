package elements.api.util.ext

import com.flowpowered.math.imaginary.Quaterniond
import com.flowpowered.math.vector.Vector3d
import org.spongepowered.api.data.property.entity.EyeLocationProperty
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.item.inventory.entity.PlayerInventory

val Player.direction: Vector3d
    get() = Quaterniond.fromAxesAnglesDeg(rotation.x, -rotation.y, -rotation.z).direction

val Player.eyePosition: Vector3d
    get() = getProperty(EyeLocationProperty::class.java).unwrap()?.value ?: position

var Player.selectedSlotIndex: Int
    get() = (inventory as PlayerInventory).hotbar.selectedSlotIndex
    set(value) {
        (inventory as PlayerInventory).hotbar.selectedSlotIndex = value
    }