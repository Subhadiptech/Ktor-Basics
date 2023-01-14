package ersubhadipcom.plugins

import ersubhadipcom.models.BooksBody
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.test() {

    routing {
        get("/book/{id}") {
            //accessing book id
            call.respondText(call.parameters["id"].toString())

        }


        //reasing body in post request
        post("/books") {
            val body = call.receive<BooksBody>()

        }

    }

}
