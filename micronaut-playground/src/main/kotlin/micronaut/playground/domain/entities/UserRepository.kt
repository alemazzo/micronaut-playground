package micronaut.playground.domain.entities

interface UserRepository {
    fun findByEmail(email: String): User?
    fun save(user: User): User
}