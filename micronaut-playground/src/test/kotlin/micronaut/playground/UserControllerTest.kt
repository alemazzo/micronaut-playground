package micronaut.playground

import io.kotest.core.spec.style.StringSpec
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import micronaut.playground.interfaces.api.LoginRequest
import micronaut.playground.interfaces.api.LoginResponse
import micronaut.playground.interfaces.api.RegisterRequest
import micronaut.playground.interfaces.api.RegisterResponse

@Client("/")
interface UserApiClient {
    @Post("/register")
    fun registerUser(@Body registerRequest: RegisterRequest): RegisterResponse
    @Post("/login")
    fun loginUser(@Body loginRequest: LoginRequest): LoginResponse
}

@MicronautTest
class UserControllerTest(@Client private val userService: UserApiClient): StringSpec({

    "A user can be registered" {
        val registerResponse = userService.registerUser(RegisterRequest(email = "ale", password = "123"))
        assert(registerResponse.email == "ale")
    }

    "A user can login" {
        val loginResponse = userService.loginUser(LoginRequest(email = "ale", password = "123"))
        assert(loginResponse.email == "ale")
    }

})