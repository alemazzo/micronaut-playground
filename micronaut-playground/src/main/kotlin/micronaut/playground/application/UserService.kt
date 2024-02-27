package micronaut.playground.application

import micronaut.playground.domain.entities.User
import micronaut.playground.domain.entities.UserRepository

open class UserService(private val userRepository: UserRepository): UserApi {

    override fun registerUser(email: String, password: String): User {
        val user = User(email = email, password = password)
        return userRepository.save(user)
    }

    override fun loginUser(email: String, password: String): User? {
        return userRepository.findByEmail(email)
            ?.takeIf { it.password == password }
    }

}