package ersubhadipcom

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ersubhadipcom.plugins.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(ContentNegotiation) {
            json()
        }
        module()
    }
        .start(wait = true)
}

fun Application.module() {
    test()
}
