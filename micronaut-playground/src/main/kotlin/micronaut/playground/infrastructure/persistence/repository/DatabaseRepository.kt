package micronaut.playground.infrastructure.persistence.repository

import io.micronaut.context.annotation.Primary
import jakarta.inject.Named
import micronaut.playground.domain.User
import micronaut.playground.domain.UserRepository
import micronaut.playground.infrastructure.configs.DatabaseConfiguration
import micronaut.playground.infrastructure.persistence.model.UserEntity
import micronaut.playground.infrastructure.persistence.model.UserModelRepository


@Primary
class UserRepositoryImpl(private val userModelRepository: UserModelRepository) : UserRepository {

    override fun findByEmail(email: String): User? {
        return userModelRepository.findById(email)
            .map { User(it.email, it.password) }
            .orElse(null)
    }

    override fun save(user: User): User {
        val userModel = UserEntity(user.email, user.password)
        return userModelRepository.save(userModel).let { User(it.email, it.password) }
    }

}
