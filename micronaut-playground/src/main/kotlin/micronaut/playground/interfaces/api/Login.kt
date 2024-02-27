package micronaut.playground.interfaces.api

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class LoginRequest(
    val email: String,
    val password: String
)

@Serdeable
data class LoginResponse(
    val email: String
)