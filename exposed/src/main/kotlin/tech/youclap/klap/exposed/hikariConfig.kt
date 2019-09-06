package tech.youclap.klap.exposed

import com.zaxxer.hikari.HikariConfig

private const val PREPSTMTCACHESIZE = 250
private const val PREPSTMTCACHESQLLIMIT = 2048

fun hikariConfig(dbHost: String, dbPort: String, dbName: String, dbUsername: String, dbPassword: String): HikariConfig {

    return HikariConfig().apply {
        jdbcUrl = "jdbc:mysql://$dbHost:$dbPort/$dbName"
        username = dbUsername
        password = dbPassword
        isAutoCommit = false
        transactionIsolation = "TRANSACTION_REPEATABLE_READ"

        // Recommended values from https://github.com/brettwooldridge/HikariCP/wiki/MySQL-Configuration
        addDataSourceProperty("useSSL", false)
        addDataSourceProperty("useUnicode", true)
        addDataSourceProperty("characterEncoding", "utf8")
        addDataSourceProperty("cachePrepStmts", true)
        addDataSourceProperty("prepStmtCacheSize", PREPSTMTCACHESIZE)
        addDataSourceProperty("prepStmtCacheSqlLimit", PREPSTMTCACHESQLLIMIT)
        addDataSourceProperty("useServerPrepStmts", true)
        addDataSourceProperty("useLocalSessionState", true)
        addDataSourceProperty("rewriteBatchedStatements", true)
        addDataSourceProperty("cacheResultSetMetadata", true)
        addDataSourceProperty("cacheServerConfiguration", true)
        addDataSourceProperty("elideSetAutoCommits", true)
        addDataSourceProperty("maintainTimeStats", true)

        validate()
    }
}
