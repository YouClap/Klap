package tech.youclap.klap.ktor.controller

import io.ktor.routing.Routing

interface Controller {
    fun boot(routing: Routing)
}
