package projects.home.amongushytte.repository

import org.springframework.data.repository.CrudRepository
import projects.home.amongushytte.dao.Game

interface GameRepository : CrudRepository<Game, Long> {
}