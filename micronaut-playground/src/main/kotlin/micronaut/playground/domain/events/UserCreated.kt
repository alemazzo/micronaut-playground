package micronaut.playground.domain.events

import java.util.Date

data class UserCreated(
    val email: String,
    val password: String,
    val timestamp: Date
)