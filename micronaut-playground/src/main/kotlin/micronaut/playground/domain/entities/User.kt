package micronaut.playground.domain.entities

data class User(
    val email: String,
    val password: String,
)

interface UserRepository {
    fun findByEmail(email: String): User?
    fun save(user: User): User
}