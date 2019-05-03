package tech.youclap.klap.vertx.extension

import io.vertx.reactivex.core.Vertx
import io.vertx.reactivex.ext.web.Router

fun Vertx.createRouter(): Router = Router.router(this)
