package micronaut.playground.infrastructure.events

import io.micronaut.data.annotation.Repository
import jakarta.inject.Singleton
import micronaut.playground.application.UserEventsService
import micronaut.playground.commons.events.EventPublisher

@Singleton
class KafkaEventPublisher(): EventPublisher {

    override fun publish(any: Any) {

    }

}

@KafkaListener
class KafkaListener(val userEventsService: UserEventsService) {

    @Topic("users")
    fun onUserCreated(userCreated: UserCreated) {
        userEventsService.onUserCreated(userCreated)
    }

    @Topic("users")
    fun onUserDeleted(userDeleted: UserDeleted) {
        userEventsService.onUserDeleted(userDeleted)
    }

}