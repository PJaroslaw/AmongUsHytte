package projects.home.amongushytte.web.resource

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import projects.home.amongushytte.repository.GameRepository
import projects.home.amongushytte.repository.RoleRepository

@Controller
class HtmlController(private val roleRepository: RoleRepository,
    private val gameRepository: GameRepository) {

    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "Among Us"
        model["roles"] = roleRepository.findAll()
        return "home"
    }

    @PostMapping("/startGame")
    fun startGame(model: Model): String {
        return "home"
    }
}