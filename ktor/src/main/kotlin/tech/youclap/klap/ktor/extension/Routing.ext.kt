package tech.youclap.klap.ktor.extension

import io.ktor.routing.Routing
import tech.youclap.klap.ktor.controller.Controller

fun Routing.route(controller: Controller) {
    controller.boot(this)
}
