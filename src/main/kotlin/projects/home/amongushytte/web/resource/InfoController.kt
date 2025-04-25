package projects.home.amongushytte.web.resource

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import projects.home.amongushytte.repository.RoleRepository

@Controller
@RequestMapping("/info")
class InfoController(private val roleRepository: RoleRepository) {

    @GetMapping()
    fun getInfo(model: Model): String {
        model["roles"] = roleRepository.findAll()
        return "info"
    }
}