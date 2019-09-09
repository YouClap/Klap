package tech.youclap.klap.ktor.model

import io.ktor.http.HttpStatusCode

class HttpError(
    val statusCode: HttpStatusCode,
    val code: Enum<*>,
    val reason: String
) : Exception()
