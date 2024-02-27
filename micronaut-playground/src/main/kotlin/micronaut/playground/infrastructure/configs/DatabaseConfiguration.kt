package micronaut.playground.infrastructure.configs

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("dbconfig")
data class DatabaseConfiguration(
    val url: String,
    val username: String,
    val password: String
)