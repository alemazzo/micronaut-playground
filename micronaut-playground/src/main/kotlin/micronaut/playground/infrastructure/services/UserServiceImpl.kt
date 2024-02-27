package micronaut.playground.infrastructure.services

import jakarta.inject.Singleton
import micronaut.playground.application.UserService
import micronaut.playground.domain.entities.UserRepository

@Singleton
class UserServiceImpl(userRepository: UserRepository) : UserService(userRepository)