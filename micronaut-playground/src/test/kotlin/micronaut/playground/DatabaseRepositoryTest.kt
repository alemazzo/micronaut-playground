package micronaut.playground

import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import jakarta.inject.Named
import micronaut.playground.domain.UserRepository
import micronaut.playground.infrastructure.persistence.repository.UserRepositoryImpl

@MicronautTest
class DatabaseRepositoryTest(@Named("database") repository: UserRepository) {


}