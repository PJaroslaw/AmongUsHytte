package projects.home.amongushytte.repository

import org.springframework.data.repository.CrudRepository
import projects.home.amongushytte.dao.Role

interface RoleRepository : CrudRepository<Role, Long> {
    fun findByName(name: String): Role
}