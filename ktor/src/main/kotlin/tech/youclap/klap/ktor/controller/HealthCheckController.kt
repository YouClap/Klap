package tech.youclap.klap.ktor.controller

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import tech.youclap.klap.ktor.controller.Controller

class HealthCheckController : Controller {

    override fun boot(routing: Routing) {
        routing.get("/healthcheck") {
            call.respond(HttpStatusCode.NoContent)
        }
    }
}
