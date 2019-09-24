package tech.youclap.klap.ktor.extension

import io.ktor.http.HttpStatusCode.Companion.InternalServerError
import tech.youclap.klap.ktor.model.ErrorCode
import tech.youclap.klap.ktor.model.ErrorCode.UNKNOWN
import tech.youclap.klap.ktor.model.HttpError

fun Throwable.toHttpError() = HttpError(InternalServerError, UNKNOWN, localizedMessage ?: message ?: toString())
