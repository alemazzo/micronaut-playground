package micronaut.playground.frameworks.persistence.repository

import jakarta.inject.Singleton
import micronaut.playground.domain.entities.User
import micronaut.playground.domain.entities.UserRepository
import micronaut.playground.frameworks.persistence.model.UserModel
import micronaut.playground.frameworks.persistence.model.UserModelRepository


@Singleton
class UserRepositoryImpl(private val userModelRepository: UserModelRepository) : UserRepository {

    override fun findByEmail(email: String): User? {
        return userModelRepository.findById(email)
            .map { User(it.email, it.password) }
            .orElse(null)
    }

    override fun save(user: User): User {
        val userModel = UserModel(user.email, user.password)
        return userModelRepository.save(userModel).let { User(it.email, it.password) }
    }

}
