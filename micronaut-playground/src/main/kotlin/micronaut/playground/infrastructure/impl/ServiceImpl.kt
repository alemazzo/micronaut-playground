package micronaut.playground.infrastructure.impl

import jakarta.inject.Named
import micronaut.playground.application.UserService
import micronaut.playground.domain.entities.UserRepository

@Named("database")
class ServiceImpl(@Named("database") userRepository: UserRepository) : UserService(userRepository)

@Named("inMemory")
class InMemoryServiceImpl(@Named("inMemory") userRepository: UserRepository) : UserService(userRepository)