package projects.home.amongushytte.repository

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import projects.home.amongushytte.dao.Role

@Configuration
class RoleConfiguration {

    @Bean
    fun roleDatabaseInitializer(roleRepository: RoleRepository) = ApplicationRunner {
        val roles = listOf(
            Role(name = "Crewmate", description = "Be yourself, and don't get killed"),
            Role(name = "Impostor", description = "Kill crewmates, and don't get caught"),
            Role(name = "Medic", description = "Revive killed crewmates"),
            Role(name = "Hunter", description = "TODO"),)
        roleRepository.saveAll(roles)
    }
}