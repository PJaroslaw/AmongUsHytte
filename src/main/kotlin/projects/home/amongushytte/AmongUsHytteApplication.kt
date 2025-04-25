package projects.home.amongushytte

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AmongUsHytteApplication

fun main(args: Array<String>) {
	runApplication<AmongUsHytteApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
