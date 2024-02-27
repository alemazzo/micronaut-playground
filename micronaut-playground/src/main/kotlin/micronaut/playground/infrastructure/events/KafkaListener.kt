package micronaut.playground.infrastructure.events

import jakarta.inject.Singleton
import micronaut.playground.application.api.UserEventsApi
import micronaut.playground.application.UserEventsService
import micronaut.playground.commons.events.EventPublisher
import micronaut.playground.commons.events.UserCreated

/**
@Singleton
class KafkaEventPublisher(): EventPublisher {

    override fun publish(any: Any) {

    }

}

@KafkaListener
class KafkaListener(userEventsService: UserEventsService): UserEventsApi {

    @Topic("user-created")
    override fun onUserCreated(userCreated: UserCreated) {
        userEventsService.onUserCreated(userCreated)
    }

}

 **/