package co.com.libosoft.demoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author duran
 *
 */

@RestController
public class ControladorInicio {

	@GetMapping("/")
	public String inicio() {
		return "Hola mundo con Spring";
	}
}
