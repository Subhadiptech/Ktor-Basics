package ersubhadipcom.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.test() {

    routing {
        get("/") {
            call.respondText("Hello Headers: ${call.request.headers.names()}")
            println("Host: ${call.request.headers["Host"]}")
            println("Connection: ${call.request.headers["Connection"]}")
            println("Cache-Control: ${call.request.headers["Cache-Control"]}")
            println("Upgrade-Insecure-Requests: ${call.request.headers["Upgrade-Insecure-Requests"]}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Accept: ${call.request.headers["Accept"]}")
            println("Accept-Language: ${call.request.headers["Accept-Language"]}")
        }
    }

}
