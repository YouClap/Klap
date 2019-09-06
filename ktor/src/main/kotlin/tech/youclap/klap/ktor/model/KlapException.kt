package tech.youclap.klap.ktor.model

sealed class KlapException : Exception() {

    data class HeaderNotFound(val name: String) : KlapException()

}
