package ersubhadipcom.plugins

import ersubhadipcom.models.BooksBody
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import java.io.File

fun Application.test() {

    routing {
        get("/book/{id}") {
            //accessing book id
            call.respondText(call.parameters["id"].toString())

        }

        //reading body in post request
        post("/books") {
            val body = call.receive<BooksBody>()
            println(body.toString())
            call.respondText("Fine")

        }

        get("/headers") {
            call.response.headers.append("auth-token", "admin123")
            call.respondText("Headers added")

        }


        //open file in browser
        //for download use attachment
        get("/fileDownload") {
            val file = File("./image.png")
            call.response.header(
                HttpHeaders.ContentDisposition,
                ContentDisposition.Inline.withParameter(
                    ContentDisposition.Parameters.FileName, "download.png"
                ).toString()
            )

        }

    }

}
