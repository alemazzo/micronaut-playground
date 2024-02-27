package micronaut.playground

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import micronaut.playground.infrastructure.web.api.LoginRequest
import micronaut.playground.infrastructure.web.api.LoginResponse
import micronaut.playground.infrastructure.web.api.RegisterRequest
import micronaut.playground.infrastructure.web.api.RegisterResponse

@Client("users")
interface UserApiClient {
    @Post("/register")
    fun registerUser(@Body registerRequest: RegisterRequest): RegisterResponse
    @Post("/login")
    fun loginUser(@Body loginRequest: LoginRequest): LoginResponse
}

@MicronautTest
class UserControllerTest {

    fun test(userService: UserApiClient) {
        val registerRequest = RegisterRequest("", "")
    }

}