package micronaut.playground.interfaces.websocket

import micronaut.playground.application.UserService

class WebsocketServer(
    private val userService: UserService
) {
    fun onOpen() {}
    fun onMessage() {}
    fun onClose() {}
}

