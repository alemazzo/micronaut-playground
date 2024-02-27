package micronaut.playground.infrastructure.web

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Singleton
import micronaut.playground.application.UserService
import micronaut.playground.interfaces.api.LoginRequest
import micronaut.playground.interfaces.api.LoginResponse
import micronaut.playground.interfaces.api.RegisterRequest
import micronaut.playground.interfaces.api.RegisterResponse
import micronaut.playground.interfaces.web.UserController


@Singleton
class UserControllerImpl(userService: UserService) : UserController(userService)

@Controller("/users")
class UserHTTPController(private val userController: UserController) {

    @Post("/login")
    fun login(@Body request: LoginRequest): LoginResponse {
        return userController.login(request)
    }

    @Post("/register")
    fun register(@Body request: RegisterRequest): RegisterResponse {
        return userController.register(request)
    }

}