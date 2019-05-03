package tech.youclap.klap.vertx.extension

import io.vertx.core.json.JsonObject

inline fun <reified T> JsonObject.mapTo(): T {
    return this.mapTo(T::class.java)
}
