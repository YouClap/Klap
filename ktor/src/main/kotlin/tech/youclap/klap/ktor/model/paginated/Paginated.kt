package tech.youclap.klap.ktor.model.paginated

data class Paginated<T>(
    val data: T,
    val page: Page
)
