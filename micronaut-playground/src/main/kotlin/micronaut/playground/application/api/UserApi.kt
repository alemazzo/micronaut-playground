package micronaut.playground.application.api

import micronaut.playground.domain.entities.User

interface UserApi {
    fun registerUser(email: String, password: String): User
    fun loginUser(email: String, password: String): User?
}