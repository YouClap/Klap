package tech.youclap.klap.core.model.paginated

data class Paginated<T>(
    val data: T,
    val page: Page
)
