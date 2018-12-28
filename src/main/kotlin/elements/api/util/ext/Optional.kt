package elements.api.util.ext

import java.util.*

fun <T> Optional<T>.unwrap(): T? = this.orElse(null)

fun <T : Any> T?.wrap(): Optional<T> = Optional.ofNullable(this)