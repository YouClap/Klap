package tech.youclap.klap.core.model.paginated

data class Paginated<T>(
    val data: T,
    val page: Page
) {
    companion object {
        fun <D> from(result: D, page: Int, per: Int, total: Long): Paginated<D> {

            val position = Position(
                current = page,
                max = (total / per).toInt()
            )

            val data = Data(
                per = per,
                total = total
            )

            val paginationPage = Page(
                position = position,
                data = data
            )

            return Paginated(
                data = result,
                page = paginationPage
            )
        }
    }
}
