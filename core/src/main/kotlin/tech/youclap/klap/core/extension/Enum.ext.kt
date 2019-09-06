package tech.youclap.klap.core.extension

inline fun <reified T : Enum<T>> valueOrNull(name: String): T? {
    return try {
        enumValueOf<T>(name)
    } catch (_: IllegalArgumentException) {
        return null
    }
}
