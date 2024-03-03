package micronaut.playground

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.FreeSpec
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import jakarta.inject.Named
import micronaut.playground.domain.UserRepository
import micronaut.playground.infrastructure.persistence.repository.UserRepositoryImpl

@MicronautTest
class DatabaseRepositoryTest(private val userRepository: UserRepository): AnnotationSpec() {

    @Test
    fun testUserRepository() {
        val users = userRepository.findByEmail("email")
        assert(users == null)
    }

}