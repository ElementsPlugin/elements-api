package elements.api.util.ext

import com.flowpowered.math.vector.Vector3d

operator fun Vector3d.times(a: Float): Vector3d = this.mul(a)
operator fun Vector3d.times(a: Double): Vector3d = this.mul(a)
operator fun Vector3d.times(v: Vector3d): Vector3d = this.mul(v)

operator fun Vector3d.plus(v: Vector3d): Vector3d = this.add(v)