package tech.youclap.klap.ktor.extension

import io.ktor.application.Application

inline val Application.env get() = environment.config.property("ktor.environment").getString().toLowerCase()
inline val Application.isDev get() = env == "dev"
inline val Application.isProd get() = env == "prod"

// TODO improve this 'environment.config.config("database")'
inline val Application.dbHost get() = environment.config.property("database.host").getString()
inline val Application.dbName get() = environment.config.property("database.name").getString()
inline val Application.dbPort get() = environment.config.property("database.port").getString()
inline val Application.dbUsername get() = environment.config.property("database.username").getString()
inline val Application.dbPassword get() = environment.config.property("database.password").getString()
