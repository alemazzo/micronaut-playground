package micronaut.playground.interfaces.web

// Depends on the application layer
import micronaut.playground.application.UserService
//
import micronaut.playground.interfaces.api.RegisterRequest
import micronaut.playground.interfaces.api.RegisterResponse
import micronaut.playground.interfaces.api.LoginRequest
import micronaut.playground.interfaces.api.LoginResponse


open class UserController(private val userService: UserService) {

    fun register(registerRequest: RegisterRequest): RegisterResponse {
        val user = userService.registerUser(registerRequest.email, registerRequest.password)
        return RegisterResponse(email = user.email)
    }

    fun login(loginRequest: LoginRequest): LoginResponse {
        val user = userService.loginUser(loginRequest.email, loginRequest.password)
            ?: throw IllegalArgumentException("Invalid credentials")
        return LoginResponse(email = user.email)
    }

}