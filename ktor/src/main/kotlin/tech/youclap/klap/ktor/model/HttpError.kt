package tech.youclap.klap.ktor.model

import io.ktor.http.HttpStatusCode

open class HttpError(
    open val statusCode: HttpStatusCode,
    open val code: String,
    open val reason: String
) : Exception()
