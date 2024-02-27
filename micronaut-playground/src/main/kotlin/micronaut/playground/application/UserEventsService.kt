package micronaut.playground.application

import micronaut.playground.commons.events.UserCreated
import micronaut.playground.domain.entities.User
import micronaut.playground.domain.entities.UserRepository

class UserEventsService(private val userRepository: UserRepository) {

    fun onUserCreated(userCreated: UserCreated) {
        userRepository.save(User(email = userCreated.email, password = userCreated.password))
    }

}