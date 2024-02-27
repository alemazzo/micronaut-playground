package micronaut.playground.infrastructure.persistence.model

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import jakarta.validation.constraints.NotBlank

@MappedEntity
data class UserModel (
    @Id
    val email: String,

    @NotBlank
    val password: String
)

@JdbcRepository(dialect = Dialect.POSTGRES)
interface UserModelRepository : CrudRepository<UserModel, String>