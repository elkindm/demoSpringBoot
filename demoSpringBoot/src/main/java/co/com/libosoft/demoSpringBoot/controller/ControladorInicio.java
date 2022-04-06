package co.com.libosoft.demoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;





/**
 * 
 * @author duran
 *
 */

@RestController
@Slf4j
public class ControladorInicio {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ControladorInicio.class);
	@GetMapping("/")
	public String inicio() {
		
		log.info("iniciando controlador inicio");
		log.debug("datos debug");
		return "Hola mundo con Spring 2";
	}
}
