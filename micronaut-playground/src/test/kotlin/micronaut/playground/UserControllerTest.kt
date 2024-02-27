package micronaut.playground

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import micronaut.playground.application.UserService
import micronaut.playground.infrastructure.web.api.LoginRequest
import micronaut.playground.infrastructure.web.api.LoginResponse
import micronaut.playground.infrastructure.web.api.RegisterRequest
import micronaut.playground.infrastructure.web.api.RegisterResponse

@MicronautTest
class UserControllerTest {

    fun test(userService: UserService) {

    }

}