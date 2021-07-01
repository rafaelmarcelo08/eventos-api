package com.rocketdev.eventoapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoResource {
	
	@GetMapping("/")
	public String iniciar() {
		return "Aplicação iniciada.";
	}

}
