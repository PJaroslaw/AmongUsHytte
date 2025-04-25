package projects.home.amongushytte.dao

import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class Role(
    var name: String,
    var description: String,
    @Id @GeneratedValue val id: Long? = null
)

@Entity
data class Game(
    var amountOfPlayers: Int,
    var date: LocalDate = LocalDate.now(),
    @ElementCollection(targetClass = Role::class) var roles: List<String>,
    @Id @GeneratedValue val id: Long? = null
)
