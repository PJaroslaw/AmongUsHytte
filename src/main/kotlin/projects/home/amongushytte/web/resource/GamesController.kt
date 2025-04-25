package projects.home.amongushytte.web.resource

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import projects.home.amongushytte.dao.Game
import projects.home.amongushytte.repository.GameRepository
import projects.home.amongushytte.repository.RoleRepository

@Controller
class GamesController(
    private val gameRepository: GameRepository,
    private val roleRepository: RoleRepository,
) {

    @PostMapping("/games")
    fun createGame(model: Model, @RequestParam(name = "amountOfPlayers") amountOfPlayer: String,
                   @RequestParam(name = "medic", defaultValue = false.toString()) medics: Boolean,
                   @RequestParam(name = "hunter", defaultValue = false.toString()) hunters: Boolean): String {
        gameRepository.save(Game(amountOfPlayers = Integer.parseInt(amountOfPlayer), roles = listOf("Crewmate", "Impostor", "Medic", "Hunter")))
        return "games"
    }

    @GetMapping("/games")
    fun getGames(model: Model): String {
        model["title"] = "Games"
        model["games"] = gameRepository.findAll()
        model["roles"] = roleRepository.findAll()
        return "games"
    }
}