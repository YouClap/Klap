package tech.youclap.klap.ktor.extension

import com.github.kittinunf.result.Result
import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.request.header
import io.ktor.response.respond
import tech.youclap.klap.ktor.model.HttpError
import tech.youclap.klap.ktor.model.KlapException

fun ApplicationCall.requestHeader(name: String) =
    request.header(name)

// TODO maybe rename to result?
suspend fun ApplicationCall.respondResult(result: Result<*, HttpError>, successHttpStatusCode: HttpStatusCode = OK) {
    result.fold({
        this.respond(successHttpStatusCode, it)
    }, {
        // TODO maybe this could be improved by having an object?
        this.respond(it.statusCode, mapOf("code" to it.code, "reason" to it.reason))
    })
}
